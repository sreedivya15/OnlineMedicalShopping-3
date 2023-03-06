package com.medical.exception;


	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public class AllExceptionDTO {

		private String msg;
		private String userInput;
		private String dateAndTime;
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public String getUserInput() {
			return userInput;
		}
		public void setUserInput(String userInput) {
			this.userInput = userInput;
		}
		public String getDateAndTime() {
			return dateAndTime;
		}
		public void setDateAndTime(String dateAndTime) {
			this.dateAndTime = dateAndTime;
		}
		
		

	}

