package CategoryA;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import com.puppycrawl.tools.checkstyle.DefaultContext;
import com.puppycrawl.tools.checkstyle.JavaParser;
import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.CheckstyleException;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.FileContents;
import com.puppycrawl.tools.checkstyle.api.FileText;
import com.puppycrawl.tools.checkstyle.api.LocalizedMessage;

class JunitHalsteadEffortTest {
	@Test
	void test() throws IOException, CheckstyleException {
		// Build File
		String filePath = "src/main/java/CategoryA/";
		//String filePath = "src/CategoryB/";
		File file = new File(filePath + "halsteadEffortCheck.java");
		//File file = new File(filePath + "testClass.java");
		FileText ft = new FileText(file,"UTF-8");
		FileContents fc = new FileContents(ft);
		
		// Fill AST with FileContents
		DetailAST root = JavaParser.parse(fc);
		JavaParser.appendHiddenCommentNodes(root);
		// Initialize Intended Check
		halsteadEffortCheck check = new halsteadEffortCheck();
		
		// Configure Check
		check.configure(new DefaultConfiguration("Local"));
		check.contextualize(new DefaultContext());
		
		check.isCommentNodesRequired();
		// Initialize Local Variables in Check
		check.beginTree(root);
		
		// Visit Each Token in Tree
		helper(check,root);
		
		// Complete tree and display intended logs to user.
		check.finishTree(root);
		
		for(LocalizedMessage lm : check.getMessages()) {
		 System.out.println(lm.getMessage());
		}
		
		//Hashtable<String,Integer> results = check.getResults();
		double results = check.getResults();
		
		// Verify Results
		
		assertEquals(1298808,results);
		System.out.println("halsteadEffort Done!");
	}
	
	public void helper(AbstractCheck b, DetailAST a) {
		while(a != null) {
			b.visitToken(a);
			helper(b,a.getFirstChild());
			a = a.getNextSibling();
		}
	}
}


