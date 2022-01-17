/*
Find Max 10 number anong 10M entries.


Approach is simple : In order to find Top 10 or Top k max number among entries , simply use Heap.
If need to find top 10 max number , use Min heap
If need to find Top 10 min number use Max heap

maintain a heap of size K , if heapsize() < k , then add element to heap 
else whenever a element greater than heap.peek() is encountered , 
remove the head of heap and add element to Heap.

Pesudo Code :
    Till array is not exhausted:
        If Heap.size < k
          add  element to heap;
        Else 
          If Arr[i] > heap.peek()
            Remove head of head
            add element to heap
*/

public static void main(String[] args) {
        
        int[] arr = {200,2,-2,89,56,43,100,97};
        int n = arr.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int k =5;
        for(int i : arr)
        {
         
            if(minHeap.size() < k)
            {
                minHeap.add(i);
            }else
            {
                if(minHeap.peek() < i)
                {
                    minHeap.poll();
                    minHeap.add(i);
                }
            }
        }  
        while(minHeap.size()>0)
        {
            System.out.println(minHeap.poll());
        }
    }   
