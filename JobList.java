//Created by: Aisha Norizan
//Created on: 26/11/2017
 
public class JobList
{
	private int cpuCycle;
	private int jobSize;
	private int allocated; // 0 = not allocated/deallocated 1 = allocated
	private int waitingTime = 0;
	private boolean success = false;
	private int intFragmentation;

	//Object(Job) Constructor :
	JobList(int cycle, int jSize, int alloc, int wait)
	{
		cpuCycle = cycle; 
		jobSize = jSize;
		allocated = alloc; 
		wait = waitingTime;
	};	
	
	//Main Method : 
	public static void main(String[] args)
	{
		//Declare class objects as arrays
		JobList[] jobNumber; 
		
		//Create the jobs using values given:
		jobNumber = createJobList();
		 
		//printJobList(jobNumber);
		//printJobList(jobNumber);
		
		calculateTotalCpuCycle(jobNumber);
		
		jobNumber = createJobList();
		calculateFirstFitA(jobNumber);
		jobNumber = createJobList();
		calculateFirstFitB(jobNumber);
		jobNumber = createJobList();
		calculateFirstFitC(jobNumber);
		jobNumber = createJobList();
		calculateFirstFitD(jobNumber);
		
		
		jobNumber = createJobList();
		calculateBestFitA(jobNumber);
		jobNumber = createJobList();
		//calculateBestFitB(jobNumber);
		//jobNumber = createJobList();
		//calculateBestFitC(jobNumber);
		//jobNumber = createJobList();
		//calculateBestFitD(jobNumber);
		
	}
 
	public static JobList[] createJobList() 
	{
		//Create 100 Jobs :
		JobList[] jobNumber = new JobList[100];
		
		//Assign values :
				jobNumber[0] = new JobList(10, 8703, 0, -1);//9
				jobNumber[1] = new JobList(12, 11499, 0, -1);//10
				jobNumber[2] = new JobList(8, 11519, 0, -1);
				jobNumber[3] = new JobList(1, 10215, 0, -1);//9
				jobNumber[4] = new JobList(13, 9666, 0, -1);
				jobNumber[5] = new JobList(11, 10501, 0, -1);
				jobNumber[6] = new JobList(12, 11322, 0, -1);
				jobNumber[7] = new JobList(7, 1719, 0, -1);//
				jobNumber[8] = new JobList(3, 2026, 0, -1);//
				jobNumber[9] = new JobList(16, 10187, 0, -1);
				jobNumber[10] = new JobList(8, 1478, 0, -1);//
				jobNumber[11] = new JobList(16, 1217, 0, -1);//6
				jobNumber[12] = new JobList(1, 11555, 0, -1);
				jobNumber[13] = new JobList(5, 1149, 0, -1);//7
				jobNumber[14] = new JobList(8,10553, 0, -1);
				jobNumber[15] = new JobList(11, 10791, 0, -1);
				jobNumber[16] = new JobList(9, 1236, 0, -1);
				jobNumber[17] = new JobList(19, 1390, 0, -1);
				jobNumber[18] = new JobList(8, 9193, 0, -1);
				jobNumber[19] = new JobList(10,8693, 0, -1);
				jobNumber[20] = new JobList(10, 10881, 0, -1);
				jobNumber[21] = new JobList(16, 10607, 0, -1);
				jobNumber[22] = new JobList(6, 9784, 0, -1);
				jobNumber[23] = new JobList(6, 9260, 0, -1);
				jobNumber[24] = new JobList(19, 1739, 0, -1);
				jobNumber[25] = new JobList(11, 1765, 0, -1);
				jobNumber[26] = new JobList(11, 11196, 0, -1);
				jobNumber[27] = new JobList(10, 11097, 0, -1);
				jobNumber[28] = new JobList(16, 1244, 0, -1);
				jobNumber[29] = new JobList(20, 9908, 0, -1);
				jobNumber[30] = new JobList(13, 1947, 0, -1);
				jobNumber[31] = new JobList(2, 9823, 0, -1);
				jobNumber[32] = new JobList(18, 10738, 0, -1);
				jobNumber[33] = new JobList(16, 2265, 0, -1);
				jobNumber[34] = new JobList(18, 2167, 0, -1);
				jobNumber[35] = new JobList(12, 11362, 0, -1);
				jobNumber[36] = new JobList(11, 11362, 0, -1);
				jobNumber[37] = new JobList(9, 8513, 0, -1);
				jobNumber[38] = new JobList(16, 8567, 0, -1);
				jobNumber[39] = new JobList(3, 1765, 0, -1);
				jobNumber[40] = new JobList(16, 10001, 0, -1);
				jobNumber[41] = new JobList(3, 2208, 0, -1);
				jobNumber[42] = new JobList(9, 10923, 0, -1);
				jobNumber[43] = new JobList(1, 1536, 0, -1);
				jobNumber[44] = new JobList(20, 1769, 0, -1);
				jobNumber[45] = new JobList(5, 11236, 0, -1);
				jobNumber[46] = new JobList(3, 1554, 0, -1);
				jobNumber[47] = new JobList(3, 1427, 0, -1);
				jobNumber[48] = new JobList(11, 11291, 0, -1);
				jobNumber[49] = new JobList(15, 11097, 0, -1);
				jobNumber[50] = new JobList(9, 11300, 0, -1);
				jobNumber[51] = new JobList(12, 10730, 0, -1);
				jobNumber[52] = new JobList(4, 9021, 0, -1);
				jobNumber[53] = new JobList(8, 9363, 0, -1);
				jobNumber[54] = new JobList(11, 9286, 0, -1);
				jobNumber[55] = new JobList(18, 10631, 0, -1);
				jobNumber[56] = new JobList(17, 9801, 0, -1);
				jobNumber[57] = new JobList(18, 8723, 0, -1);
				jobNumber[58] = new JobList(7, 2118, 0, -1);
				jobNumber[59] = new JobList(8, 11367, 0, -1);
				jobNumber[60] = new JobList(7, 10507, 0, -1);
				jobNumber[61] = new JobList(18, 8810, 0, -1);
				jobNumber[62] = new JobList(5, 9163, 0, -1);
				jobNumber[63] = new JobList(1, 1830, 0, -1);
				jobNumber[64] = new JobList(1, 8851, 0, -1);
				jobNumber[65] = new JobList(9, 2082, 0, -1);
				jobNumber[66] = new JobList(3, 9269, 0, -1);
				jobNumber[67] = new JobList(11, 9250, 0, -1);
				jobNumber[68] = new JobList(13, 11170, 0, -1);
				jobNumber[69] = new JobList(19, 11285, 0, -1);
				jobNumber[70] = new JobList(15, 9519, 0, -1);
				jobNumber[71] = new JobList(9, 8891, 0, -1);
				jobNumber[72] = new JobList(19, 11039, 0, -1);
				jobNumber[73] = new JobList(19, 2591, 0, -1);
				jobNumber[74] = new JobList(19, 2163, 0, -1);
				jobNumber[75] = new JobList(13, 11212, 0, -1);
				jobNumber[76] = new JobList(19, 10273, 0, -1);
				jobNumber[77] = new JobList(4, 8449, 0, -1);
				jobNumber[78] = new JobList(18, 1134, 0, -1);
				jobNumber[79] = new JobList(17, 11055, 0, -1);
				jobNumber[80] = new JobList(12, 9132, 0, -1);
				jobNumber[81] = new JobList(19, 10419, 0, -1);
				jobNumber[82] = new JobList(9, 8368, 0, -1);
				jobNumber[83] = new JobList(12, 8587, 0, -1);
				jobNumber[84] = new JobList(18, 10244, 0, -1);
				jobNumber[85] = new JobList(2, 8883, 0, -1);
				jobNumber[86] = new JobList(19, 1512, 0, -1);
				jobNumber[87] = new JobList(6, 10913, 0, -1);
				jobNumber[88] = new JobList(14, 9605, 0, -1);
				jobNumber[89] = new JobList(9, 8356, 0, -1);
				jobNumber[90] = new JobList(16, 10266, 0, -1);
				jobNumber[91] = new JobList(19, 9601, 0, -1);
				jobNumber[92] = new JobList(18, 11595, 0, -1);
				jobNumber[93] = new JobList(5, 9885, 0, -1);
				jobNumber[94] = new JobList(18, 1227, 0, -1);
				jobNumber[95] = new JobList(2, 8339, 0, -1);
				jobNumber[96] = new JobList(4, 10953, 0, -1);
				jobNumber[97] = new JobList(10, 2424, 0, -1);
				jobNumber[98] = new JobList(19, 11223, 0, -1);
				jobNumber[99] = new JobList(13, 10897, 0, -1);
			
				return jobNumber; //return the whole list if function is called
	}

	public static void calculateTotalCpuCycle (JobList[] jobNumber) //to get turnaround time
	{
		int totalCpuCycle = 0;
		for(int i = 0; i<100; i++)
		{
			totalCpuCycle +=jobNumber[i].cpuCycle;
		}
		
		System.out.println("Total CPU Cycle : " +totalCpuCycle);
	}
	
	public static void printJobList(JobList[] jobNumber) 
	{
		for (int i = 1; i<100; i++)
		{
			System.out.println("Job [" +(i+1)+ "]");
			System.out.println("CPU Cycle :" +jobNumber[i].cpuCycle);
			System.out.println("Job Size:" +jobNumber[i].jobSize +"\n");
		}
	}
	
	public static void calculateFirstFitA(JobList[] jobNumber)
	{
		int[] blockSizeA = {1125, 3750, 1875, 8625, 9750, 7500, 9000, 10125,11250, 12000};	
		
		//Part 1 : Initializations
		int flags[] = new int[10]; int allocation[] = new int[10]; 
		int i, j, k, l;
		
		double totalBlockUsedA = 0.0;
		int totalintFragmentationA = 0;
		
		for(i = 0; i < 10; i++) //Initialize all blocks are free and allocations are not performed
	    {
			flags[i] = 0; 
			allocation[i] = -1; 
	    }
//		
		for(i = 0; i < 100; i++)//initialize all jobs waiting time = 0
		{
			jobNumber[i].waitingTime = 0;
		}
				
		System.out.println("-------------------------------------------------");
		System.out.println("Performing First Fit for Memory Configuration A..");
		System.out.println("-------------------------------------------------");
				
		//Part 2 : Perform First Fit for Current Jobs
		for (i = 0; i < 100; i++)//job loop
		{
			for(j = 0; j < 10; j++)//memory block loop
			{
				if (flags[j] == 0 && blockSizeA[j] >= jobNumber[i].jobSize)
				{
					allocation[j] = i; //allocate memory block[j] to jobNo[i]
					flags[j] = 1; // memory block[j] is flagged (no longer vacant)
					jobNumber[i].allocated = j;  //allocate job to memory block
					System.out.println("Job[" +(i+1)+"]("+jobNumber[i].jobSize+") ----------> Block[" +(j+1)+"]("+blockSizeA[j]+") CYCLE : " +jobNumber[i].cpuCycle);
							
					jobNumber[i].intFragmentation = blockSizeA[j] - jobNumber[i].jobSize;
					//System.out.println("Internal Fragmentation : " +jobNumber[i].intFragmentation);
							
					totalintFragmentationA+= jobNumber[i].intFragmentation;
							
					jobNumber[i].success = true;
					totalBlockUsedA +=  blockSizeA[j];
					break; 
				} 
			}
					
		//Part 3 : Entertain queing jobs : 
		
			for (k=0; k<100; k++)
			{
				if (jobNumber[k].success) //if a job is successfully allocated
				{
					jobNumber[k].cpuCycle--;
					if(jobNumber[k].cpuCycle == 0)
					{
						System.out.println("(Clock finish for Job[" +(k+1)+"].  Free-ing Memory Block[" +(jobNumber[k].allocated +1)+"]...)");
						flags[jobNumber[k].allocated] = 0; //free memory block
						allocation[jobNumber[k].allocated] = -1; //set memory block as vacant
						        
						for(l = 0; l < i; l++)
						{
						        	
							if (jobNumber[l].success != true)
						   	{
//
								jobNumber[l].waitingTime++;
								if (flags[jobNumber[k].allocated] == 0 && blockSizeA[jobNumber[k].allocated] >= jobNumber[l].jobSize)
						        {
						  			allocation[jobNumber[k].allocated] = l; //allocate memory block[j] to jobNo[i]
					      			flags[jobNumber[k].allocated] = 1; // set status block = vacant
				        			jobNumber[l].success = true;
				        			jobNumber[l].allocated = jobNumber[k].allocated; //allocate the queuing job to the block allocated to the finished job
						        	System.out.println("Job[" +(l+1)+"]("+jobNumber[l].jobSize+") ----------> Block[" +((jobNumber[k].allocated)+1)+"]("+blockSizeA[jobNumber[k].allocated]+") CYCLE : " +jobNumber[l].cpuCycle);
						        			
						       		jobNumber[l].intFragmentation = blockSizeA[jobNumber[k].allocated] - jobNumber[l].jobSize;
									//System.out.println("Internal Fragmentation : " +jobNumber[l].intFragmentation);
											
									totalintFragmentationA+= jobNumber[l].intFragmentation;
								    totalBlockUsedA +=  blockSizeA[jobNumber[k].allocated];
						        			
				        			break;
				        		}
					     	}
					   }
					}
				}
				else
				{
					continue;
				}
			}//end loop jobs to check un-entertained jobs		
		} //end first fit for memory block A
//		

		//Part 3 : Calculate Evaluations
				
		System.out.println("\n---------------------------------------------\nSummary : \n---------------------------------------------");
		//double memoryUtilizationBlockAFirstFit = 0.0;
		double totalBlockFitA = 0.0;
		totalBlockFitA = totalBlockUsedA - totalintFragmentationA;
		
		System.out.println("Total Internal Fragmentation is: " +totalintFragmentationA);
//
		//Calculate total waiting time
		double totalWaitingTimeA = 0.0;
		for (i = 0; i < 100; i++) 
		{
			totalWaitingTimeA += jobNumber[i].waitingTime;
		}
		System.out.println("Total Waiting Time for all jobs : " +totalWaitingTimeA);
		//Calculate average waiting time
		double avgWaitingTimeA = totalWaitingTimeA / 100;
		System.out.println("Average waiting time for each jobs : " +avgWaitingTimeA);
		
		double totalTurnAroundTimeA;
		totalTurnAroundTimeA = totalWaitingTimeA + 1112.0;
		System.out.println("Total Turnaround Time : " +totalTurnAroundTimeA);
		System.out.println("Average Turnaround Time for all jobs: " +(totalTurnAroundTimeA/100));
		
		System.out.println("Total Blocks Allocated : " +totalBlockUsedA);
		System.out.println("Total Blocks Fit : "+totalBlockFitA);
		//memoryUtilizationBlockAFirstFit = totalBlockFit / totalBlockUsedA;
		
		System.out.println("Memory Utilization for Memory Configuration A = " +((totalBlockFitA / totalBlockUsedA)*100)+"%");
	}//end func
	
	public static void calculateFirstFitB(JobList[] jobNumber)
	{
		int[] blockSizeB = {2625, 3000, 3375, 4125, 3750, 4500, 9750, 9000, 13875, 21000};
		//Part 1 : Initializations
		int flags[] = new int[10]; int allocation[] = new int[10]; 
		int i, j, k, l;
		double totalBlockUsedB = 0.0;
		int totalintFragmentationB = 0;
				
		for(i = 0; i < 10; i++) //Initialize all blocks are free and allocations are not performed
	    {
			flags[i] = 0; 
			allocation[i] = -1;
	    }
		for(i = 0; i < 100; i++)//initialize all jobs waiting time = 0
		{
			jobNumber[i].waitingTime = 0;
		}
		System.out.println("\n\n-------------------------------------------------");
		System.out.println("Performing First Fit for Memory Configuration B..");
		System.out.println("-------------------------------------------------");
				
		//Part 2 : Perform First Fit for Current Jobs
		for (i = 0; i < 100; i++)//job loop
		{
			for(j = 0; j < 10; j++)//memory block loop
			{
				if (flags[j] == 0 && blockSizeB[j] >= jobNumber[i].jobSize)
				{
					allocation[j] = i; //allocate memory block[j] to jobNo[i]
					flags[j] = 1; // memory block[j] is flagged (no longer vacant)
					jobNumber[i].allocated = j;  //allocate job to memory block
					System.out.println("Job[" +(i+1)+"]("+jobNumber[i].jobSize+") ----------> Block[" +(j+1)+"]("+blockSizeB[j]+") CYCLE : " +jobNumber[i].cpuCycle);
							
					jobNumber[i].intFragmentation = blockSizeB[j] - jobNumber[i].jobSize;
					//System.out.println("Internal Fragmentation : " +jobNumber[i].intFragmentation);
							
					totalintFragmentationB+= jobNumber[i].intFragmentation;
							
					jobNumber[i].success = true;
					totalBlockUsedB +=  blockSizeB[j];
					break; 
				} 
			}	
		//Part 3 : Entertain queuing jobs : 
		
			for (k=0; k<100; k++)
			{
				if (jobNumber[k].success) //if a job is successfully allocated
				{
					jobNumber[k].cpuCycle--;
					if(jobNumber[k].cpuCycle == 0)
					{
						System.out.println("                                                     Clock finish for Job[" +(k+1)+"].  Free-ing Memory Block[" +(jobNumber[k].allocated +1)+"]...");
						flags[jobNumber[k].allocated] = 0; //free memory block
						allocation[jobNumber[k].allocated] = -1; //set memory block as vacant
						        
						for(l = 0; l < i; l++)
						{
						        	
							if (jobNumber[l].success != true)
						   	{
								jobNumber[l].waitingTime++;
								if (flags[jobNumber[k].allocated] == 0 && blockSizeB[jobNumber[k].allocated] >= jobNumber[l].jobSize)
						        {
						  			allocation[jobNumber[k].allocated] = l; //allocate memory block[j] to jobNo[i]
					      			flags[jobNumber[k].allocated] = 1; // set status block = vacant
				        			jobNumber[l].success = true;
				        			jobNumber[l].allocated = jobNumber[k].allocated; //allocate the queuing job to the block allocated to the finished job
						        	System.out.println("Job[" +(l+1)+"]("+jobNumber[l].jobSize+") ----------> Block[" +((jobNumber[k].allocated)+1)+"]("+blockSizeB[jobNumber[k].allocated]+") CYCLE : " +jobNumber[l].cpuCycle);
						        			
						       		jobNumber[l].intFragmentation = blockSizeB[jobNumber[k].allocated] - jobNumber[l].jobSize;
									//System.out.println("Internal Fragmentation : " +jobNumber[l].intFragmentation);
											
									totalintFragmentationB+= jobNumber[l].intFragmentation;
								    totalBlockUsedB +=  blockSizeB[jobNumber[k].allocated];
						        			
				        			break;
				        		}
					     	}
					   }
					}
				}
				else
				{
					continue;
				}
			}//end loop jobs to check un-entertained jobs		
		} //end first fit for memory block A
				
		//Part 3 : Calculate Evaluations 
				
		System.out.println("\n---------------------------------------------\nSummary : \n---------------------------------------------");
		//double memoryUtilizationBlockAFirstFit = 0.0;
		double totalBlockFitB = 0.0;
		totalBlockFitB = totalBlockUsedB - totalintFragmentationB;
		
		System.out.println("Total Internal Fragmentation is: " +totalintFragmentationB);
		//Calculate total waiting time
		double totalWaitingTimeB = 0.0;
		for (i = 0; i < 100; i++)
		{
			totalWaitingTimeB += jobNumber[i].waitingTime;
		}
		System.out.println("Total Waiting Time for all jobs : " +totalWaitingTimeB);
		
		//Calculate average waiting time
		double avgWaitingTimeB = totalWaitingTimeB / 100;
		System.out.println("Average waiting time for each jobs : " +avgWaitingTimeB);
		
		double totalTurnAroundTimeB;
		totalTurnAroundTimeB = totalWaitingTimeB + 1112.0;
		System.out.println("Total Turnaround Time : " +totalTurnAroundTimeB);
		System.out.println("Average Turnaround Time for all jobs: " +(totalTurnAroundTimeB/100));
				
		System.out.println("Total Blocks Allocated : " +totalBlockUsedB);
		System.out.println("Total Blocks Fit : "+totalBlockFitB);
		//memoryUtilizationBlockAFirstFit = totalBlockFitB / totalBlockUsedB;
		
		System.out.println("Memory Utilization for Memory Configuration B = "+((totalBlockFitB / totalBlockUsedB)*100)+"%");
	}
	
	public static void calculateFirstFitC(JobList[] jobNumber)
	{
		int[] blockSizeC = {8250, 7500, 7125, 10125, 7125, 8625, 9375, 5625, 6000, 5250};
		//Part 1 : Initializations
				int flags[] = new int[10]; int allocation[] = new int[10]; 
				int i, j, k, l;
				double totalBlockUsedC = 0.0;
				int totalintFragmentationC = 0;
			
				for(i = 0; i < 10; i++) //Initialize all blocks are free and allocations are not performed
			    {
			        flags[i] = 0; 
			        allocation[i] = -1;
			    }
				
				for(i = 0; i < 100; i++)//initialize all jobs waiting time = 0
				{
					jobNumber[i].waitingTime = 0;
				}
				System.out.println("\n\n-------------------------------------------------");
				System.out.println("Performing First Fit for Memory Configuration C..");
				System.out.println("-------------------------------------------------");
				
				//Part 2 : Perform First Fit for Current Jobs
				for (i = 0; i < 100; i++)//job loop
				{
					for(j = 0; j < 10; j++)//memory block loop
					{
						if (flags[j] == 0 && blockSizeC[j] >= jobNumber[i].jobSize)
						{
							allocation[j] = i; //allocate memory block[j] to jobNo[i]
							flags[j] = 1; // memory block[j] is flagged (no longer vacant)
							jobNumber[i].allocated = j;  //allocate job to memory block
							System.out.println("Job[" +(i+1)+"]("+jobNumber[i].jobSize+") ----------> Block[" +(j+1)+"]("+blockSizeC[j]+") CYCLE : " +jobNumber[i].cpuCycle);
							
							jobNumber[i].intFragmentation = blockSizeC[j] - jobNumber[i].jobSize;
							//System.out.println("Internal Fragmentation : " +jobNumber[i].intFragmentation);
							
							totalintFragmentationC+= jobNumber[i].intFragmentation;
							
							jobNumber[i].success = true;
							totalBlockUsedC +=  blockSizeC[j];
							break; 
						} 
					}
					
					//Part 3 : Entertain queing jobs : 
					
					for (k=0; k<100; k++)
					{
						if (jobNumber[k].success) //if a job is successfully allocated
						{
							jobNumber[k].cpuCycle--;
							if(jobNumber[k].cpuCycle == 0)
							{
								System.out.println("                                                     Clock finish for Job[" +(k+1)+"].  Free-ingMemory Block[" +(jobNumber[k].allocated +1)+"]...");
								flags[jobNumber[k].allocated] = 0; //free memory block
						        allocation[jobNumber[k].allocated] = -1; //set memory block as vacant
						        
						        for(l = 0; l < i; l++)
						        {
						        	
						        	if (jobNumber[l].success != true)
						        	{
						        		jobNumber[l].waitingTime++;
						        		if (flags[jobNumber[k].allocated] == 0 && blockSizeC[jobNumber[k].allocated] >= jobNumber[l].jobSize)
						        		{
						        			allocation[jobNumber[k].allocated] = l; //allocate memory block[j] to jobNo[i]
						        			flags[jobNumber[k].allocated] = 1; // set status block = vacant
						        			jobNumber[l].success = true;
						        			jobNumber[l].allocated = jobNumber[k].allocated; //allocate the queuing job to the block allocated to the finished job
						        			System.out.println("Job[" +(l+1)+"]("+jobNumber[l].jobSize+") ----------> Block[" +((jobNumber[k].allocated)+1)+"]("+blockSizeC[jobNumber[k].allocated]+") CYCLE : " +jobNumber[l].cpuCycle);
						        			
						        			jobNumber[l].intFragmentation = blockSizeC[jobNumber[k].allocated] - jobNumber[l].jobSize;
											//System.out.println("Internal Fragmentation : " +jobNumber[l].intFragmentation);
											
											totalintFragmentationC+= jobNumber[l].intFragmentation;
										    totalBlockUsedC +=  blockSizeC[jobNumber[k].allocated];
						        			
						        			break;
						        		}
						        	}
						        }
							}
						}
						else
						{
							continue;
						}
					}//end loop jobs to check un-entertained jobs		
			} //end first fit for memory block A
				
				//Part 3 : Calculate Evaluations 
				
				System.out.println("\n---------------------------------------------\nSummary : \n---------------------------------------------");
				
				double totalBlockFitC = 0;
				totalBlockFitC = totalBlockUsedC - totalintFragmentationC;
				
				System.out.println("Total Internal Fragmentation is: " +totalintFragmentationC);
				
				//Calculate total waiting time
				double totalWaitingTimeC = 0.0;
				for (i = 0; i < 100; i++) 
				{
					totalWaitingTimeC += jobNumber[i].waitingTime;
				}
				System.out.println("Total Waiting Time for all jobs : " +totalWaitingTimeC);
				
				//Calculate average waiting time
				double avgWaitingTimeC = totalWaitingTimeC / 100;
				System.out.println("Average waiting time for each jobs : " +avgWaitingTimeC);
				
				double totalTurnAroundTimeC;
				totalTurnAroundTimeC = totalWaitingTimeC + 1112.0;
				System.out.println("Total Turnaround Time : " +totalTurnAroundTimeC);
				System.out.println("Average Turnaround Time for all jobs: " +(totalTurnAroundTimeC/100));
				
				System.out.println("Total Blocks Allocated : " +totalBlockUsedC);
				System.out.println("Total Blocks Fit : "+totalBlockFitC);
				
				System.out.println("Memory Utilization for Memory Configuration C = "+((totalBlockFitC / totalBlockUsedC)*100)+"%");
	}
	
	public static void calculateFirstFitD(JobList[] jobNumber)
	{
		int[] blockSizeD = {4125, 4875, 5625, 4500, 3750, 10500, 9000, 9750, 11250, 11625};
	
		//Initialization : 
		int flags[] = new int[10]; int allocation[] = new int[10]; 
		int i, j, k, l;
		double totalBlockUsedD = 0.0;
		int totalintFragmentationD = 0;
		
		
		for(i = 0; i < 10; i++) //Initialize all blocks are free and allocations are not performed
	    {
	        flags[i] = 0; 
	        allocation[i] = -1;
	    }
		
		for(i = 0; i < 100; i++)//initialize all jobs waiting time = 0
		{
			jobNumber[i].waitingTime = 0;
		}
		
		System.out.println("\n\n-------------------------------------------------");
		System.out.println("Performing First Fit for Memory Configuration D..");
		System.out.println("-------------------------------------------------");
		
		//Part 2 : Perform First Fit for Current Jobs
		for (i = 0; i < 100; i++)//job loop
		{
			for(j = 0; j < 10; j++)//memory block loop
			{
				if (flags[j] == 0 && blockSizeD[j] >= jobNumber[i].jobSize)
				{
					allocation[j] = i; //allocate memory block[j] to jobNo[i]
					flags[j] = 1; // memory block[j] is flagged (no longer vacant)
					jobNumber[i].allocated = j;  //allocate job to memory block
					System.out.println("Job[" +(i+1)+"]("+jobNumber[i].jobSize+") ----------> Block[" +(j+1)+"]("+blockSizeD[j]+") CYCLE : " +jobNumber[i].cpuCycle);
					
					jobNumber[i].intFragmentation = blockSizeD[j] - jobNumber[i].jobSize;
					//System.out.println("Internal Fragmentation : " +jobNumber[i].intFragmentation);
					
					totalintFragmentationD+= jobNumber[i].intFragmentation;
					
					jobNumber[i].success = true;
					totalBlockUsedD +=  blockSizeD[j];
					break; 
				} 
			}
			
			//Part 3 : Entertain queing jobs : 
			
			for (k=0; k<100; k++)
			{
				if (jobNumber[k].success) //if a job is successfully allocated
				{
					jobNumber[k].cpuCycle--;
					if(jobNumber[k].cpuCycle == 0)
					{
						System.out.println("                                                     Clock finish for Job[" +(k+1)+"].  Free-ingMemory Block[" +(jobNumber[k].allocated +1)+"]...");
						flags[jobNumber[k].allocated] = 0; //free memory block
				        allocation[jobNumber[k].allocated] = -1; //set memory block as vacant
				        
				        for(l = 0; l < i; l++)
				        {
				        	
				        	if (jobNumber[l].success != true)
				        	{
				        		jobNumber[l].waitingTime++;
				        		if (flags[jobNumber[k].allocated] == 0 && blockSizeD[jobNumber[k].allocated] >= jobNumber[l].jobSize)
				        		{
				        			allocation[jobNumber[k].allocated] = l; //allocate memory block[j] to jobNo[i]
				        			flags[jobNumber[k].allocated] = 1; // set status block = vacant
				        			jobNumber[l].success = true;
				        			jobNumber[l].allocated = jobNumber[k].allocated; //allocate the queuing job to the block allocated to the finished job
				        			System.out.println("Job[" +(l+1)+"]("+jobNumber[l].jobSize+") ----------> Block[" +((jobNumber[k].allocated)+1)+"]("+blockSizeD[jobNumber[k].allocated]+") CYCLE : " +jobNumber[l].cpuCycle);
				        			
				        			jobNumber[l].intFragmentation = blockSizeD[jobNumber[k].allocated] - jobNumber[l].jobSize;
									//System.out.println("Internal Fragmentation : " +jobNumber[l].intFragmentation);
									
									totalintFragmentationD+= jobNumber[l].intFragmentation;
								    totalBlockUsedD +=  blockSizeD[jobNumber[k].allocated];
				        			
				        			break;
				        		}
				        	}
				        }
					}
				}
				else
				{
					continue;
				}
			}//end loop jobs to check un-entertained jobs		
	} //end first fit for memory block A
		
		//Part 3 : Calculate Evaluations
		
		System.out.println("\n---------------------------------------------\nSummary : \n---------------------------------------------");
		//double memoryUtilizationBlockAFirstFit = 0.0;
		double totalBlockFitD;
		totalBlockFitD = totalBlockUsedD - totalintFragmentationD;
		
		System.out.println("Total Internal Fragmentation is: " +totalintFragmentationD);
		//Calculate total waiting time
		double totalWaitingTimeD = 0.0;
		for (i = 0; i < 100; i++) 
		{
			totalWaitingTimeD += jobNumber[i].waitingTime;
		}
		System.out.println("Total Waiting Time for all jobs : " +totalWaitingTimeD);
		
		//Calculate average waiting time
		double avgWaitingTimeD = totalWaitingTimeD / 100;
		System.out.println("Average waiting time for each jobs : " +avgWaitingTimeD);
		
		double totalTurnAroundTimeD;
		totalTurnAroundTimeD = totalWaitingTimeD + 1112.0;
		System.out.println("Total Turnaround Time : " +totalTurnAroundTimeD);
		System.out.println("Average Turnaround Time for all jobs: " +(totalTurnAroundTimeD/100));
		
		System.out.println("Total Blocks Allocated : " +totalBlockUsedD);
		System.out.println("Total Blocks Fit : "+totalBlockFitD);
		//memoryUtilizationBlockAFirstFit = totalBlockFit / totalBlockUsedD;
		
		System.out.println("Memory Utilization for Memory Configuration D = "+((totalBlockFitD / totalBlockUsedD)*100)+"%");
	}
	
	public static void calculateBestFitA(JobList[] jobNumber)

	
	{
		int[] blockSizeA = {1125, 3750, 1875, 8625, 9750, 7500, 9000, 10125,11250, 12000};
		
		//Part 1 : Initializations				
		int flags[] = new int[10]; int allocation[] = new int[10]; int[] fitBlockList = new int[10];
		int a = 0;
		int i, j, k, l;
		double totalBlockUsedA = 0;
		int totalintFragmentationA = 0;
		
		int smallestBlock;
		int blockFound = 0;
				
		for(i = 0; i < 10; i++) //Initialize all blocks are free and allocations are not performed
		{
	        flags[i] = 0; 
	        allocation[i] = -1;
	    }
		for(i = 0; i < 100; i++)//initialize all jobs waiting time = 0
		{
			jobNumber[i].waitingTime = 0;
		}
				
		System.out.println("\n\n------------------------------------------------");
		System.out.println("Performing Best Fit for Memory Configuration A..");
		System.out.println("------------------------------------------------");
				
		//Part 2 : Perform Best Fit for Current Jobs
		for (i = 0; i < 100; i++)//job loop
		{
			for(j = 0; j < 10; j++)//memory block loop
			{	
				//Best fit Part 1: Create A List that stores all blocks that fits the job
				if (flags[j] == 0 && blockSizeA[j] >= jobNumber[i].jobSize) //if any block size is vacant and big enough to fit the job
				{
					System.out.println("Block found which is at [" +j+ "]" );
					blockFound = 1;//block is found
					fitBlockList[a] = j; //insert the block number into fitting list
					a++; //next fitting block will be listed into the next index
					System.out.println("");
				}
			}//end block search
			System.out.println("a = " +a);
			a = 0;
			//Best fit Part 2: Find smallest block in the list
			if(blockFound == 1) //if there are available blocks that fits
			{
				smallestBlock = fitBlockList[0]; //Assume the smallest block is the first listed block
				for(k = 0; k <= a; k++) //traverse list of fitting jobs
				{
					if(fitBlockList[k] < smallestBlock)
					{
						System.out.println("Smallest block : "  +(k+1));
						smallestBlock = k;
					}
				}
				
				//Best fit Part 3 : Allocate Job into the smallest block
				allocation[smallestBlock] = i;
				flags[smallestBlock] = 1;
				jobNumber[i].allocated = smallestBlock;
				System.out.println("Job[" +(i+1)+"]("+jobNumber[i].jobSize+") ----------> Block[" +(smallestBlock+1)+"]("+blockSizeA[smallestBlock]+") CYCLE : " +jobNumber[i].cpuCycle+"\n");
				jobNumber[i].success = true;
						
				jobNumber[i].intFragmentation = blockSizeA[smallestBlock] - jobNumber[i].jobSize;
				System.out.println("Internal Fragmentation : " +jobNumber[i].intFragmentation);
				totalintFragmentationA+= jobNumber[i].intFragmentation;
						
				totalBlockUsedA +=  blockSizeA[smallestBlock];		
			
			//Part 3 : Entertain queuing jobs : 
			
			for (k=0; k<100; k++)
			{
				if (jobNumber[k].success) //if a job is successfully allocated
				{
					jobNumber[k].cpuCycle--;
					if(jobNumber[k].cpuCycle == 0)
					{
						System.out.println("Clock finish for Job[" +(k+1)+"]");
						System.out.println("Free-ingMemory Block[" +(jobNumber[k].allocated +1)+"]...");
						flags[jobNumber[k].allocated] = 0; //free memory block
				        allocation[jobNumber[k].allocated] = -1; //set memory block as vacant
				        
				        for(l = 0; l < i; l++)
				        {	
				        	if (jobNumber[l].success != true)
				        	{
				        		jobNumber[l].waitingTime++;
				        		if (flags[jobNumber[k].allocated] == 0 && blockSizeA[jobNumber[k].allocated] >= jobNumber[l].jobSize)
				        		{
				        			allocation[jobNumber[k].allocated] = l; //allocate memory block[j] to jobNo[i]
				        			flags[jobNumber[k].allocated] = 1; // set status block = vacant
				        			jobNumber[l].success = true;
				        			jobNumber[l].allocated = jobNumber[k].allocated; //allocate the queuing job to the block allocated to the finished job
				        			System.out.println("Job[" +(l+1)+"]("+jobNumber[l].jobSize+") ----------> Block[" +((jobNumber[k].allocated)+1)+"]("+blockSizeA[jobNumber[k].allocated]+") CYCLE : " +jobNumber[l].cpuCycle+"\n");
				        			
				        			jobNumber[l].intFragmentation = blockSizeA[jobNumber[k].allocated] - jobNumber[l].jobSize;
									System.out.println("Internal Fragmentation : " +jobNumber[l].intFragmentation);
									
									totalintFragmentationA+= jobNumber[l].intFragmentation;
								    totalBlockUsedA +=  blockSizeA[jobNumber[k].allocated];
				        			
				        			break;
				        		}
				        	}
				        }
					}
				}
				else
				{
					continue;
				}
			}//end loop jobs to check un-entertained jobs		
		}
					
	} //end job loop
				
				//Part 3 : Calculate Evaluations
				
				System.out.println("\n---------------------------------------------\nSummary : \n---------------------------------------------");
				//double memoryUtilizationBlockAFirstFit = 0.0;
				double totalBlockFit;
				totalBlockFit = totalBlockUsedA - totalintFragmentationA;
				
				System.out.println("Total Internal Fragmentation is: " +totalintFragmentationA);
				
				System.out.println("Total Blocks used : " +totalBlockFit);
				//memoryUtilizationBlockAFirstFit = totalBlockFit / totalBlockUsedA;
				
				System.out.println("Memory Utilization = (" +totalBlockFit+ ")/(" +totalBlockUsedA+ ")*100% = "+((totalBlockFit / totalBlockUsedA)*100)+"%");
	}//end CalculateBestFit Method

	public static void calculateBestFitB(JobList[] jobNumber)
	{
		int[] blockSizeB = {2625, 3000, 3375, 4125, 3750, 4500, 9750, 9000, 13875, 21000};
		
		//Part 1 : Initializations				
				int flags[] = new int[10]; int allocation[] = new int[10]; int[] fitBlockList = new int[10];
				int a = 0;
				int i, j, k, l;
				double totalBlockUsedA = 0;
				int totalintFragmentationA = 0;
				
				int smallestBlock;
				int blockFound = 0;
						
				for(i = 0; i < 10; i++) //Initialize all blocks are free and allocations are not performed
				{
			        flags[i] = 0; 
			        allocation[i] = -1;
			    }
				for(i = 0; i < 100; i++)//initialize all jobs waiting time = 0
				{
					jobNumber[i].waitingTime = 0;
				}	
				System.out.println("\n\n------------------------------------------------");
				System.out.println("Performing Best Fit for Memory Configuration B..");
				System.out.println("------------------------------------------------");
						
				//Part 2 : Perform Best Fit for Current Jobs
				for (i = 0; i < 100; i++)//job loop
				{
					for(j = 0; j < 10; j++)//memory block loop
					{
						//Best fit Part 1: Create A List that stores all blocks that fits the job
						if (flags[j] == 0 && blockSizeB[j] >= jobNumber[i].jobSize) //if any block size is vacant and big enough to fit the job
						{
							blockFound = 1;//block is found
							fitBlockList[a] = j; //insert the block number into fitting list
							a++; //next fitting block will be listed into the next index
						}
					}//end block search
					
					//Best fit Part 2: Find smallest block in the list
					if(blockFound == 1) //if there are available blocks that fits
					{
						smallestBlock = fitBlockList[0]; //Assume the smallest block is the first listed block
						for(k = 0; k <= a; k++) //traverse list of fitting jobs
						{
							if(fitBlockList[k] < smallestBlock)
							{
								smallestBlock = k;
							}
						}
						
						//Best fit Part 3 : Allocate Job into the smallest block
						allocation[smallestBlock] = i;
						flags[smallestBlock] = 1;
						jobNumber[i].allocated = smallestBlock;
						System.out.println("Job[" +(i+1)+"]("+jobNumber[i].jobSize+") ----------> Block[" +(smallestBlock+1)+"]("+blockSizeB[smallestBlock]+") CYCLE : " +jobNumber[i].cpuCycle+"\n");
						jobNumber[i].success = true;
								
						jobNumber[i].intFragmentation = blockSizeB[smallestBlock] - jobNumber[i].jobSize;
						System.out.println("Internal Fragmentation : " +jobNumber[i].intFragmentation);
						totalintFragmentationA+= jobNumber[i].intFragmentation;
								
						totalBlockUsedA +=  blockSizeB[smallestBlock];		
					//Part 3 : Entertain queing jobs : 
					for (k=0; k<100; k++)
					{
						if (jobNumber[k].success) //if a job is successfully allocated
						{
							jobNumber[k].cpuCycle--;
							if(jobNumber[k].cpuCycle == 0)
							{
								System.out.println("Clock finish for Job[" +(k+1)+"]");
								System.out.println("Free-ingMemory Block[" +(jobNumber[k].allocated +1)+"]...");
								flags[jobNumber[k].allocated] = 0; //free memory block
						        allocation[jobNumber[k].allocated] = -1; //set memory block as vacant
						        
						        for(l = 0; l < i; l++)
						        {
						        	if (jobNumber[l].success != true)
						        	{
						        		jobNumber[l].waitingTime++;
						        		if (flags[jobNumber[k].allocated] == 0 && blockSizeB[jobNumber[k].allocated] >= jobNumber[l].jobSize)
						        		{
						        			allocation[jobNumber[k].allocated] = l; //allocate memory block[j] to jobNo[i]
						        			flags[jobNumber[k].allocated] = 1; // set status block = vacant
						        			jobNumber[l].success = true;
						        			jobNumber[l].allocated = jobNumber[k].allocated; //allocate the queuing job to the block allocated to the finished job
						        			System.out.println("Job[" +(l+1)+"]("+jobNumber[l].jobSize+") ----------> Block[" +((jobNumber[k].allocated)+1)+"]("+blockSizeB[jobNumber[k].allocated]+") CYCLE : " +jobNumber[l].cpuCycle+"\n");
						        			
						        			jobNumber[l].intFragmentation = blockSizeB[jobNumber[k].allocated] - jobNumber[l].jobSize;
											System.out.println("Internal Fragmentation : " +jobNumber[l].intFragmentation);
											
											totalintFragmentationA+= jobNumber[l].intFragmentation;
										    totalBlockUsedA +=  blockSizeB[jobNumber[k].allocated];
						        			
						        			break;
						        		}
						        	}
						        }
							}
						}
						else
						{
							continue;
						}
					}//end loop jobs to check un-entertained jobs		
				}
							
			} //end job loop
						
				//Part 3 : Calculate Evaluations
						
						System.out.println("\n---------------------------------------------\nSummary : \n---------------------------------------------");
						//double memoryUtilizationBlockAFirstFit = 0.0;
						double totalBlockFit;
						totalBlockFit = totalBlockUsedA - totalintFragmentationA;
						
						System.out.println("Total Internal Fragmentation is: " +totalintFragmentationA);
						
						System.out.println("Total Blocks used : " +totalBlockFit);
						//memoryUtilizationBlockAFirstFit = totalBlockFit / totalBlockUsedA;
						
						System.out.println("Memory Utilization = (" +totalBlockFit+ ")/(" +totalBlockUsedA+ ")*100% = "+((totalBlockFit / totalBlockUsedA)*100)+"%");
	}
	
	public static void calculateBestFitC(JobList[] jobNumber)
	{
		int[] blockSizeC = {8250, 7500, 7125, 10125, 7125, 8625, 9375, 5625, 6000, 5250};
		//Part 1 : Initializations				
				int flags[] = new int[10]; int allocation[] = new int[10]; int[] fitBlockList = new int[10];
				int a = 0;
				int i, j, k, l;
				double totalBlockUsedA = 0;
				int totalintFragmentationA = 0;
				
				int smallestBlock;
				int blockFound = 0;
						
				for(i = 0; i < 10; i++) //Initialize all blocks are free and allocations are not performed
				{
			        flags[i] = 0; 
			        allocation[i] = -1;
			    }
				for(i = 0; i < 100; i++)//initialize all jobs waiting time = 0
				{
					jobNumber[i].waitingTime = 0;
				}
				
				System.out.println("\n\n------------------------------------------------");
				System.out.println("Performing Best Fit for Memory Configuration A..");
				System.out.println("------------------------------------------------");
						
				//Part 2 : Perform Best Fit for Current Jobs
				for (i = 0; i < 100; i++)//job loop
				{
					for(j = 0; j < 10; j++)//memory block loop
					{
						//Best fit Part 1: Create A List that stores all blocks that fits the job
						if (flags[j] == 0 && blockSizeC[j] >= jobNumber[i].jobSize) //if any block size is vacant and big enough to fit the job
						{
							blockFound = 1;//block is found
							fitBlockList[a] = j; //insert the block number into fitting list
							a++; //next fitting block will be listed into the next index
						}
					}//end block search
					
					//Best fit Part 2: Find smallest block in the list
					if(blockFound == 1) //if there are available blocks that fits
					{
						smallestBlock = fitBlockList[0]; //Assume the smallest block is the first listed block
						for(k = 0; k <= a; k++) //traverse list of fitting jobs
						{
							if(fitBlockList[k] < smallestBlock)
							{
								smallestBlock = k;
							}
						}
						
						//Best fit Part 3 : Allocate Job into the smallest block
						allocation[smallestBlock] = i;
						flags[smallestBlock] = 1;
						jobNumber[i].allocated = smallestBlock;
						System.out.println("Job[" +(i+1)+"]("+jobNumber[i].jobSize+") ----------> Block[" +(smallestBlock+1)+"]("+blockSizeC[smallestBlock]+") CYCLE : " +jobNumber[i].cpuCycle+"\n");
						jobNumber[i].success = true;
								
						jobNumber[i].intFragmentation = blockSizeC[smallestBlock] - jobNumber[i].jobSize;
						System.out.println("Internal Fragmentation : " +jobNumber[i].intFragmentation);
						totalintFragmentationA+= jobNumber[i].intFragmentation;
								
						totalBlockUsedA +=  blockSizeC[smallestBlock];		
					
					//Part 3 : Entertain queing jobs : 
					
					for (k=0; k<100; k++)
					{
						if (jobNumber[k].success) //if a job is successfully allocated
						{
							jobNumber[k].cpuCycle--;
							if(jobNumber[k].cpuCycle == 0)
							{
								System.out.println("Clock finish for Job[" +(k+1)+"]");
								System.out.println("Free-ingMemory Block[" +(jobNumber[k].allocated +1)+"]...");
								flags[jobNumber[k].allocated] = 0; //free memory block
						        allocation[jobNumber[k].allocated] = -1; //set memory block as vacant
						        
						        for(l = 0; l < i; l++)
						        {
						        	
						        	if (jobNumber[l].success != true)
						        	{
						        		jobNumber[l].waitingTime++;
						        		if (flags[jobNumber[k].allocated] == 0 && blockSizeC[jobNumber[k].allocated] >= jobNumber[l].jobSize)
						        		{
						        			allocation[jobNumber[k].allocated] = l; //allocate memory block[j] to jobNo[i]
						        			flags[jobNumber[k].allocated] = 1; // set status block = vacant
						        			jobNumber[l].success = true;
						        			jobNumber[l].allocated = jobNumber[k].allocated; //allocate the queuing job to the block allocated to the finished job
						        			System.out.println("Job[" +(l+1)+"]("+jobNumber[l].jobSize+") ----------> Block[" +((jobNumber[k].allocated)+1)+"]("+blockSizeC[jobNumber[k].allocated]+") CYCLE : " +jobNumber[l].cpuCycle+"\n");
						        			
						        			jobNumber[l].intFragmentation = blockSizeC[jobNumber[k].allocated] - jobNumber[l].jobSize;
											System.out.println("Internal Fragmentation : " +jobNumber[l].intFragmentation);
											
											totalintFragmentationA+= jobNumber[l].intFragmentation;
										    totalBlockUsedA +=  blockSizeC[jobNumber[k].allocated];
						        			
						        			break;
						        		}
						        	}
						        }
							}
						}
						else
						{
							continue;
						}
					}//end loop jobs to check un-entertained jobs		
				}
							
			} //end job loop
						
				//Part 3 : Calculate Evaluations
						
						System.out.println("\n---------------------------------------------\nSummary : \n---------------------------------------------");
						//double memoryUtilizationBlockAFirstFit = 0.0;
						double totalBlockFit;
						totalBlockFit = totalBlockUsedA - totalintFragmentationA;
						
						System.out.println("Total Internal Fragmentation is: " +totalintFragmentationA);
						
						System.out.println("Total Blocks used : " +totalBlockFit);
						//memoryUtilizationBlockAFirstFit = totalBlockFit / totalBlockUsedA;
						
						System.out.println("Memory Utilization = (" +totalBlockFit+ ")/(" +totalBlockUsedA+ ")*100% = "+((totalBlockFit / totalBlockUsedA)*100)+"%");
						
						
			
	}
	
	public static void calculateBestFitD(JobList[] jobNumber)
	{
		int[] blockSizeD = {4125, 4875, 5625, 4500, 3750, 10500, 9000, 9750, 11250, 11625};
		//Part 1 : Initializations				
				int flags[] = new int[10]; int allocation[] = new int[10]; int[] fitBlockList = new int[10];
				int a = 0;
				int i, j, k, l;
				double totalBlockUsedA = 0;
				int totalintFragmentationA = 0;
				
				int smallestBlock;
				int blockFound = 0;
						
				for(i = 0; i < 10; i++) //Initialize all blocks are free and allocations are not performed
				{
			        flags[i] = 0; 
			        allocation[i] = -1;
			    }
				for(i = 0; i < 100; i++)//initialize all jobs waiting time = 0
				{
					jobNumber[i].waitingTime = 0;
				}
				
				System.out.println("\n\n------------------------------------------------");
				System.out.println("Performing Best Fit for Memory Configuration A..");
				System.out.println("------------------------------------------------");
						
				//Part 2 : Perform Best Fit for Current Jobs
				for (i = 0; i < 100; i++)//job loop
				{
					for(j = 0; j < 10; j++)//memory block loop
					{
						//Best fit Part 1: Create A List that stores all blocks that fits the job
						if (flags[j] == 0 && blockSizeD[j] >= jobNumber[i].jobSize) //if any block size is vacant and big enough to fit the job
						{
							blockFound = 1;//block is found
							fitBlockList[a] = j; //insert the block number into fitting list
							a++; //next fitting block will be listed into the next index
						}
					}//end block search
					
					//Best fit Part 2: Find smallest block in the list
					if(blockFound == 1) //if there are available blocks that fits
					{
						smallestBlock = fitBlockList[0]; //Assume the smallest block is the first listed block
						for(k = 0; k <= a; k++) //traverse list of fitting jobs
						{
							if(fitBlockList[k] < smallestBlock)
							{
								smallestBlock = k;
							}
						}
						
						//Best fit Part 3 : Allocate Job into the smallest block
						allocation[smallestBlock] = i;
						flags[smallestBlock] = 1;
						jobNumber[i].allocated = smallestBlock;
						System.out.println("Job[" +(i+1)+"]("+jobNumber[i].jobSize+") ----------> Block[" +(smallestBlock+1)+"]("+blockSizeD[smallestBlock]+") CYCLE : " +jobNumber[i].cpuCycle+"\n");
						jobNumber[i].success = true;
								
						jobNumber[i].intFragmentation = blockSizeD[smallestBlock] - jobNumber[i].jobSize;
						System.out.println("Internal Fragmentation : " +jobNumber[i].intFragmentation);
						totalintFragmentationA+= jobNumber[i].intFragmentation;
								
						totalBlockUsedA +=  blockSizeD[smallestBlock];		
					
					//Part 3 : Entertain queing jobs : 
					
					for (k=0; k<100; k++)
					{
						if (jobNumber[k].success) //if a job is successfully allocated
						{
							jobNumber[k].cpuCycle--;
							if(jobNumber[k].cpuCycle == 0)
							{
								System.out.println("Clock finish for Job[" +(k+1)+"]");
								System.out.println("Free-ingMemory Block[" +(jobNumber[k].allocated +1)+"]...");
								flags[jobNumber[k].allocated] = 0; //free memory block
						        allocation[jobNumber[k].allocated] = -1; //set memory block as vacant
						        
						        for(l = 0; l < i; l++)
						        {
						        	
						        	if (jobNumber[l].success != true)
						        	{
						        		jobNumber[l].waitingTime++;
						        		if (flags[jobNumber[k].allocated] == 0 && blockSizeD[jobNumber[k].allocated] >= jobNumber[l].jobSize)
						        		{
						        			allocation[jobNumber[k].allocated] = l; //allocate memory block[j] to jobNo[i]
						        			flags[jobNumber[k].allocated] = 1; // set status block = vacant
						        			jobNumber[l].success = true;
						        			jobNumber[l].allocated = jobNumber[k].allocated; //allocate the queuing job to the block allocated to the finished job
						        			System.out.println("Job[" +(l+1)+"]("+jobNumber[l].jobSize+") ----------> Block[" +((jobNumber[k].allocated)+1)+"]("+blockSizeD[jobNumber[k].allocated]+") CYCLE : " +jobNumber[l].cpuCycle+"\n");
						        			
						        			jobNumber[l].intFragmentation = blockSizeD[jobNumber[k].allocated] - jobNumber[l].jobSize;
											System.out.println("Internal Fragmentation : " +jobNumber[l].intFragmentation);
											
											totalintFragmentationA+= jobNumber[l].intFragmentation;
										    totalBlockUsedA +=  blockSizeD[jobNumber[k].allocated];
						        			
						        			break;
						        		}
						        	}
						        }
							}
						}
						else
						{
							continue;
						}
					}//end loop jobs to check un-entertained jobs		
				}
							
			} //end job loop
						
						//Part 3 : Calculate Evaluations
						
						System.out.println("\n---------------------------------------------\nSummary : \n---------------------------------------------");
						//double memoryUtilizationBlockAFirstFit = 0.0;
						double totalBlockFit;
						totalBlockFit = totalBlockUsedA - totalintFragmentationA;
						
						System.out.println("Total Internal Fragmentation is: " +totalintFragmentationA);
						
						System.out.println("Total Blocks used : " +totalBlockFit);
						//memoryUtilizationBlockAFirstFit = totalBlockFit / totalBlockUsedA;
						
						System.out.println("Memory Utilization = (" +totalBlockFit+ ")/(" +totalBlockUsedA+ ")*100% = "+((totalBlockFit / totalBlockUsedA)*100)+"%");
						
	}
}	

