 <h1>Parallel Word Count Using ExecutorService</h1>

  <h2>Description</h2>
  <p>In this project, you will process a list of files in parallel, reading lines of text and counting the number of words in each line. The task utilizes <code>ExecutorService</code> and a thread pool to manage concurrent file processing.</p>

  <h2>Requirements</h2>
  <ol>
      <li><strong>Create a Thread Pool:</strong> Use <code>Executors.newFixedThreadPool(int nThreads)</code> to create a fixed-size thread pool, where <code>nThreads</code> is the number of threads in the pool.</li>
      <li><strong>Task Implementation:</strong> Implement a <code>WordCountTask</code> class that implements the <code>Runnable</code> interface. This class should:
          <ul>
              <li>Receive a file as input.</li>
              <li>In the <code>run</code> method, read lines from the file, count the number of words in each line, and output the result to the console.</li>
          </ul>
      </li>
      <li><strong>Using ExecutorService:</strong> Utilize <code>ExecutorService</code> to submit jobs to the thread pool for execution. These jobs should use the <code>WordCountTask</code> class.</li>
      <li><strong>Correct Shutdown:</strong> After all jobs have been submitted, properly shut down the thread pool using the <code>shutdown()</code> method and wait for all threads to finish executing.</li>
  </ol>

  <h2>Important Notes</h2>
  <p class="important">The files for processing are already included in the project. Do not create or modify these files!</p>
  <p class="important">Only implement the methods required for the task. Do not alter any other part of the codebase!</p>
