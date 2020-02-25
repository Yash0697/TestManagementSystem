package test;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface UserInterface {

	public Test addTest(Test test);
	public Question addQuestions(BigInteger testId,Question question);
	public Question deleteQuestions(BigInteger testId,Question question);
	public boolean assignTest(Long userId, BigInteger TestId);
	public Test deleteTest(BigInteger testId);
	public Question updateQuestions(BigInteger testId,Question question);
	public Test updateTest(BigInteger testId, Test test);	
	public BigDecimal getResult(Test test);
}
