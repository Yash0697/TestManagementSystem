package test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;
import java.util.HashSet;



public class Test {
		private BigInteger testId;
		private String testTitle;
		private LocalTime testDuration;
		private Set<Question> testQuestions = new HashSet<Question>();
		private BigDecimal testTotalMarks = new BigDecimal(0);
		private BigDecimal testMarksScored;
		private Question currentQuestion;
		private LocalDateTime startTime;
		private LocalDateTime endTime;
		
		public BigInteger getTestId() {
			return testId;
		}
		public void setTestId(BigInteger testId) {
			this.testId = testId;
		}
		public String getTestTitle() {
			return testTitle;
		}
		public void setTestTitle(String testTitle) {
			this.testTitle = testTitle;
		}
		public LocalTime getTestDuration() {
			return testDuration;
		}
		public void setTestDuration(LocalTime testDuration) {
			this.testDuration = testDuration;
		}
		public BigDecimal getTestTotalMarks() {
			return testTotalMarks;
		}
		public BigDecimal getTestMarksScored() {
			return testMarksScored;
		}
		public void setTestMarksScored(BigDecimal testMarksScored) {
			this.testMarksScored = testMarksScored;
		}
		public Question getCurrentQuestion() {
			return currentQuestion;
		}
		public void setCurrentQuestion(Question currentQuestion) {
			this.currentQuestion = currentQuestion;
		}
		public LocalDateTime getStartTime() {
			return startTime;
		}
		public void setStartTime(LocalDateTime startTime2) {
			this.startTime = startTime2;
		}
		public LocalDateTime getEndTime() {
			return endTime;
		}
		public void setEndTime(LocalDateTime endTime) {
			this.endTime = endTime;
		}
		public Set<Question> getTestQuestions() {
			return testQuestions;
		}
		public void setTestQuestions(Set<Question> testQuestions) {
			this.testQuestions = testQuestions;
		}
		
		
		public void setTestTotalMarks(BigDecimal testTotalMarks2) {
			this.testTotalMarks = testTotalMarks2; 
			
		}

}
