package CategoryB;

import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

public class numberCommentsCheck extends AbstractCheck{

int count = 0;
	
	@Override
	public int[] getDefaultTokens() {
		return new int[] { TokenTypes.SINGLE_LINE_COMMENT, TokenTypes.BLOCK_COMMENT_BEGIN};
	}
	
	@Override
	public int[] getAcceptableTokens() {
		return new int[] {TokenTypes.SINGLE_LINE_COMMENT, TokenTypes.BLOCK_COMMENT_BEGIN};
	}
	
	@Override
	public int[] getRequiredTokens() {
		return new int[] {TokenTypes.SINGLE_LINE_COMMENT, TokenTypes.BLOCK_COMMENT_BEGIN};
	}
	
	@Override
	public void beginTree(DetailAST rootAST) {
		count = 0;
	}
	
	@Override
	public void finishTree(DetailAST rootAST) {
		log(rootAST.getLineNo(), "Number of comments: "+ count + "-IA");
	}
	
	@Override
	public void visitToken(DetailAST ast) {
		count++;
	}
	
	@Override
	public boolean isCommentNodesRequired() {
		return true;
	}
}
