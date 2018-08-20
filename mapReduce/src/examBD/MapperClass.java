package examBD;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class MapperClass extends MapReduceBase implements Mapper<LongWritable, Text, CompositeKey, IntWritable>{

	@Override
	public void map(LongWritable key, Text value,OutputCollector<CompositeKey, IntWritable> arg2, Reporter reporter)
	throws IOException {
		String row = value.toString();
		
		String[] cells = row.split("\t");
		
		String serverId = cells[4]; 
		String time = cells[1];
		int usage = Integer.parseInt(cells[2]);
		CompositeKey cKey = null;
		if (time >= 5 && time < 8) {
			cKey = new CompositeKey(key, "Early");
		}
		// do the rest 
		
		output.collect(cKey, new IntWritable(usage));
 }	  
 	 

	

}
