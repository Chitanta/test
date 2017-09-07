package com.est;

public class EmotionEvent {
		private Object source;
		public EmotionEvent(Object source){
			this.source=source;
		}
		public Object getSource() {
			return source;
		}
		public void setSource(Object source) {
			this.source = source;
		}
	
}
