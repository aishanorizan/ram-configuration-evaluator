# ram-configuration-evaluator
Evaluation of Memory Allocation and Configuration Strategies in Achieving Highest Memory Utilization and CPU Performance - An Algorithm

 
Management of main memory is critical as an entire system performance are highly dependent on two aspects; how much memory is available and how the memory is optimized during job processing. The question is, how is one memory management strategy evaluated for a computing system? This is a comprehensive algorithm on dynamic partitioning of the main memory and how different placement strategies are evaluated in various performance metrics. Two memory placement algorithms are implemented, which are Best-fit memory allocation algorithm and First-fit memory allocation algorithm.

You can customize your own CPU cycle & Memory needed for a job using in this constructor:
JobList(int cpuCycle, int jSize, int alloc, int wait)

E.g.: 
Memory needd = 8703K
Cpu Cycles needed = 10 cycles.

jobNumber[0] = new JobList(10, 8703, 0, -1)


Compile & run the java program - JobList.java.

The evaluation need to consider the following performance metrics:
<ol>
 <li>Turnaround time for every job and the average for all jobs;</li>
  <li>Waiting time for every job and the average for all jobs;</li>
  <li>Internal fragmentation for every job and the total for jobs</li>
  <li>Memory utilization, i.e.  percentage of CPU cycles spend on each memory block;
</li>
 </ol>
