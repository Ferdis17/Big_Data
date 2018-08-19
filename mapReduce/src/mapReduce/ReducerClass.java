package mapReduce;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class ReducerClass extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable> {

	final int TRESHOLD = 30;

	@Override
	public void reduce(Text key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter arg3)
			throws IOException {
		int val = 0;

		while (values.hasNext()) {
			val = values.next().get();
			if (val >= TRESHOLD) {

				output.collect(key, new IntWritable(val));
			}
		}
	}

}
