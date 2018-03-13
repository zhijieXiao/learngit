
public class Question {

	/***
	*	获取从队列交替取数后的结果
	*	思路：由于双端队列可以从对头或者对尾出队，因此A、B取数时便是对每一次MAX（对头i，队尾j）的值
	*	@param arry[] 给定数组An
	*	@param n 给定数组长度
	*/
	private static void getResult(long[] arry,int n)
	{
		//取数人A、B
		long peopleA = 0L;
		long peopleB = 0L;
		//队头下标
		int dequeFront = 0;
		//队尾下标
		int dequeBack =n-1;
		//temp奇偶控制A、B交替取数
		int temp = 0;
		//队头下标超过队列尾下标结束循环
		while(dequeFront <= dequeBack){
			//不妨另A先取数
			if(temp % 2==0)
			{
				//A获取当前队头，队尾的最大值
				if(arry[dequeFront] >= arry[dequeBack]){
					peopleA+=arry[dequeFront];
					dequeFront++;
				}else
				{
					peopleA+=arry[dequeBack];
					dequeBack--;
				}
				System.out.println("peopleA's Sum:"+peopleA);
			}else{
				//B获取当前队头、队尾的最大值
				if(arry[dequeFront] >= arry[dequeBack]){
					peopleB+=arry[dequeFront];
					dequeFront++;
				}else
				{
					peopleB+=arry[dequeBack];
					dequeBack--;
				}
				System.out.println("peopleB's Sum:"+peopleB);
			}
			temp++;
		}

		System.out.println("Finally peopleA's Sum:"+peopleA);
		System.out.println("Finally peopleB's Sum:"+peopleB);

	}

	public static void main(String[] args) {
		long[] An= new long[5];
		An[0]=1L;
		An[1]=100L;
		An[2]=3l;
		An[3]=101L;
		An[4]=1L;
		getResult(An,5);
  	}
}