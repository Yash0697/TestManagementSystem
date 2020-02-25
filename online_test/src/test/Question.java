package test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Question {
	private BigInteger questionId;
	private String questionTitle;
	private int questionAnswer;
	private BigDecimal questionMarks;
	private int chosenAnswer;
	private BigDecimal marksScored;
	private String []questionOptions=new String[4];
	public BigInteger getQuestionId() {
		return questionId;
	}	
	public void setQuestionId(BigInteger questionId) {
		this.questionId = questionId;
	}	
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public int getQuestionAnswer() {
		return questionAnswer;
	}	
	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}	
	public BigDecimal getQuestionMarks() {
		return questionMarks;
	}	
	public void setQuestionMarks(BigDecimal questionMarks) {
		this.questionMarks = questionMarks;
	}	
	public int getChosenAnswer() {
		return chosenAnswer;
	}	
	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}	
	public BigDecimal getMarksScored() {
		return marksScored;
	}	
	public void setMarksScored(BigDecimal marksScored) {
		this.marksScored = marksScored;
	}	
	public String[] getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(String[] questionOptions) {
		this.questionOptions = questionOptions;
	}
	
}