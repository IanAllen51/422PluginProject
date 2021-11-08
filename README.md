# 422PluginProject

Project Deliverable 2-

General Overveiw:
Overall coverage of 422PluginProject was 96.3%. Check classes coverage was 92.5% (95.3% for CategoryA and 85.9% for CategoryB). Test class coverage was 99.4% (99.6% for CategoryA and 98.9% for CategoryB). Coverage loss was mainly attributed to finishTree not being covered fully in tests for all checks. There was one issue in branch coverage (documented in the following).

Notes:
log(rootAST.getLine,) was a common missed coverage in all methods in both categories. CategoryA finishTree(DetailAST) had calculation within, however due to timing and issues with correct mocking, values such as difficulty,effort,Volume were not able to be accurately covered in test cases. CategoryB numberComLinesCheck experienced similar errors in attempting to traverse both statement coverages(more information follows).

CategoryA-

HalsteadLength:
Overall coverage was 97.6%. 100% coverage for all methods except finishTree(DetailAST) (0.0%). There were no branches in check, therefore only line coverage.

HalsteadVocabulary:
Overall coverage was 96.2%. 100% coverage for all methods except finishTree(DetailAST) (0.0%). visitToken(DetailAST) implemented a switch statement that included 7 cases for different unique operands. Each was succesfully tested with different tokentype. The defualt case included all unique operands. 100% coverage of all cases.

HalsteadVolume:
Overall coverage was 94.6%. 100% coverage for all methods except finishTree(DetailAST) (0.0%). visitToken(DetailAST) implemented a switch statement that included 7 cases for different unique operands. Each was succesfully tested with different tokentype. The defualt case included all unique operands. 100% coverage of all cases.

HalsteadEffort:
Overall coverage was 92.9%. 100% coverage for all methods except finishTree(DetailAST) (0.0%). visitToken(DetailAST) implemented a switch statement that included 7 cases for different unique operands. Each was succesfully tested with different tokentype. The defualt case included all unique operands. 100% coverage of all cases.

HalsteadDifficulty:
Overall coverage was 95.8%. 100% coverage for all methods except finishTree(DetailAST) (0.0%). visitToken(DetailAST) implemented a switch statement that included 7 cases for different unique operands. Each was succesfully tested with different tokentype. The defualt case included all unique operands. 100% coverage of all cases.


CategoryB-

numberComments:
Overall coverage was 72.2%. 100% coverage for all methods except finishTree(DetailAST) (0.0%). The visitToken(DetailAST) incremented a counter for each acceptable token read. There were no branch statements, statement coverage for full file.

numberExpressions:
Overall coverage was 66.7%. 100% coverage for all methods except finishTree(DetailAST) (0.0%). The visitToken(DetailAST) incremented a counter for each acceptable token read. There were no branch statements, statement coverage for full file.

numberLoopStatements:
Overall coverage was 79.2%. 100% coverage for all methods except finishTree(DetailAST) (0.0%). The visitToken(DetailAST) incremented a counter for each acceptable token read. There were no branch statements, statement coverage for full file.

numberOperands:
Overall coverage was 81.5%. 100% coverage for all methods except finishTree(DetailAST) (0.0%). The visitToken(DetailAST) incremented a counter for each acceptable token read. Because unique operands were not parsed in CategoryB, there were no branch statements, statement coverage for full file.

numberOperators:
Overall coverage was 96.6%. 100% coverage for all methods except finishTree(DetailAST) (0.0%). The visitToken(DetailAST) incremented a counter for each acceptable token read. Because unique operators were not parsed in CategoryB, there were no branch statements, statement coverage for full file.

numberComLines:
Overall coverage was 55.4% coverage. visitToken(DetailAST) only had 30.6% coverage do to only 1 of 2 branches being covered. The false branch was covered, however the true branch would enter the into the block and because of incorrect mocking, values returned 2 when 5 was expected. This error was not fixed prior to submission. FinishTree(DetailAST) had 0.0% coverage. All other methods had 100% coverage.
