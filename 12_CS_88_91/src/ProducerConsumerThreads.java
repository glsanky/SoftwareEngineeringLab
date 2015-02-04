/* This is a program to solve the Producer Consumer Problem using Threads */
/* Date:- 4th February 2015 */
/* Authored by Sankarshan Purkayastha and Arun Pandey */
/* Roll no 12/CS/88 and Roll no 12/CS/91*/


public class ProducerConsumerThreads { //Defining the primary class ProducerConsumerThreads
public static void main(String[] args) { //Defining the main function of ProducerConsumerThreads
      Data c = new Data();
      Producer produce = new Producer(c, 1);//Creating a Producer object
      Consumer consume = new Consumer(c, 1);//Creating a Consumer object
      produce.start(); //Starting the Producer thread
      consume.start(); //Starting the Consumer thread
   }
}
class Data{
   private double contents; //Checking contents
   private boolean available = false; //Checking availability of contents
   public synchronized double get() {
      while (available == false) {
         try {
            wait(); //Waiting for producer to produce
         }
         catch (InterruptedException e) {
         }
      }
      available = false;
      notifyAll();
      return contents;
   }
   public synchronized void put(double value) {
      while (available == true) {
         try {
            wait();//Waiting for consumer to consume
         }
         catch (InterruptedException e) { 
         } 
      }
      contents = value;// make contents equal to value
      available = true;
      notifyAll();
   }
}

class Consumer extends Thread { //Making a Consumer class which extends Thread
   private Data Data;// Making a private Data object
   private double number;
   public Consumer(Data c, double number) {//Constructor initialisation
      Data = c;
      this.number = number;
   }
   public void run() {//In this function, Consumer consumes the data
	   double value = 0;
         for (int i = 0; i < 10; i++) {
            value = Data.get();//Consumption going on
            System.out.println("Consumer #" 
			+ this.number
+ " got: " + value);// printing the Consumed Value
}
}
}

class Producer extends Thread {//Making a Producer class which extends Thread
private Data Data;// Making a private Data object
private double number;

public Producer(Data c, double number) {//Constructor initialisation
Data = c;
this.number = number;
}

public void run() {//In this function, Producer produces the data
for (int i = 0; i < 10; i++) {
	double copy=Math.random()*100;//Production going on
Data.put(copy);
System.out.println("Producer #" + this.number
+ " put: " + copy);//Printing the produced value
try {
sleep((int)(Math.random() * 100));
} catch (InterruptedException e) { }
}
}
}