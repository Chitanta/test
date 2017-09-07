package com.est;

import java.util.HashSet;
import java.util.Set;

//事件源
public class Girl {
		private String name;
		private Set<EmotionListener> set=new HashSet<EmotionListener>();
		public Girl(String name){
			this.name=name;
		}
		public void addEmotionListener(EmotionListener l){
			set.add(l);
		}
		public void happy(){
			EmotionEvent e=new EmotionEvent(this);
			for(EmotionListener l:set){
				l.happy(e);
			}
		}
		public void sad(){
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}
