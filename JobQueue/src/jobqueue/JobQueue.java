package jobqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author jupachonc
 */
public class JobQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nthreads = scanner.nextInt();
        
        int ntasks = scanner.nextInt();
        
        int[] threads = new int[nthreads];
        
        Queue<Integer> tasks = new LinkedList<Integer>();
        
        for(int i = 0; i < ntasks; i++){
            tasks.add(scanner.nextInt());
        }
        int time = 0;
        while (!tasks.isEmpty()){
            for(int x = 0; x < nthreads; x++){
                if(threads[x] == 0 && !tasks.isEmpty()){
                    threads[x] = tasks.poll();   
                    System.out.println(x + " " + time);
                }
            }
            time++;
            for(int x = 0; x < nthreads; x++){
               threads[x] = threads[x]- 1;
            }
            
        }
        
    }
    
}
