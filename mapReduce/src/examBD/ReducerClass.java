package examBD;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class ReducerClass extends MapReduceBase implements Reducer<LongWritable, IntWritable, CompositeKey, IntWritable>{

	@Override
	public void reduce(LongWritable arg0, Iterator<IntWritable> arg1, OutputCollector<CompositeKey, IntWritable> arg2,
			Reporter arg3) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
