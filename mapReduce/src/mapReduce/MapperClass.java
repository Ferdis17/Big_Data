package mapReduce;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class MapperClass extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>{

	@Override
	public void map(LongWritable key, Text raw, OutputCollector<Text, IntWritable> output, Reporter arg3)
			throws IOException {
		
		String mRow = raw.toString();
		StringTokenizer iterable = new StringTokenizer(mRow, "\t");
		String year = iterable.nextToken();
		String lastToken = "";
		
		while(iterable.hasMoreTokens()) {
			lastToken = iterable.nextToken();
		}
		
		int avPrice = 0;
		
		output.collect(new Text(year), new IntWritable(avPrice));
		
		
	}

}
