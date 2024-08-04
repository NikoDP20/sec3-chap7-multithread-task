<h1>Challenge Executors</h1>

<p><strong>Description:</strong></p>
<p>Imagine you have a list of files, each containing lines of text. Your task is to read the lines from these files in parallel and count the number of words in each line. Use <code>ExecutorService</code>, <code>Future</code>, and a thread pool to complete the task.</p>

<h2>Requirements:</h2>
<ol>
    <li><strong>Creating a Thread Pool:</strong> Create a fixed-size thread pool using <code>Executors.newFixedThreadPool(int nThreads)</code>, where <code>nThreads</code> is the number of threads in the pool.</li>
    <li><strong>Task Implementation:</strong> Implement a class <code>WordCountTask</code> that implements the <code>Callable&lt;String&gt;</code> interface and takes a file as input. In the <code>call</code> method of this class, read the lines from the file, count the number of words in each line, and print the result to the console.</li>
    <li><strong>Using <code>ExecutorService</code>:</strong> Use <code>ExecutorService</code> to submit tasks to the thread pool. The tasks should use the <code>WordCountTask</code> class.</li>
</ol>

<p>Additionally, the string that you generate in a separate thread should be returned, and using the <code>get()</code> method of the <code>Future</code> interface, retrieve the result of the thread execution and print it to the console in the main method.</p>

<p>In the string returned by the thread, use the following format:</p>
<pre><code>String.format("File: %s | Line: %s | Word Count %d")</code></pre>
