package com.company.Queue;
import java.util.*;

    public class QueueUsingTwoStacks2 {
        protected Stack<Integer> input;
        protected Stack<Integer> output;

        public QueueUsingTwoStacks2(){
            this.input=new Stack<>();
            this.output=new Stack<>();
        }

        public void offer(int value){
            input.push(value);
        }

        public int poll() {
            if(!output.isEmpty()){
                return output.pop();
            } else {
                while (!input.isEmpty()){
                    output.push(input.pop());
                }
                return output.pop();
            }
        }

        public int peek() {
            if(!output.isEmpty()){
                return output.peek();
            } else {
                while (!input.isEmpty()){
                    output.push(input.pop());
                }
                return output.peek();
            }
        }
}
