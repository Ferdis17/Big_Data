package examBD;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class CompositeKey implements WritableComparable{
	
	 private String serverId;
	   private String partOfTheDay;
	   

	public CompositeKey(String serverId, String partOfTheDay) {
	
		this.serverId = serverId;
		this.partOfTheDay = partOfTheDay;
	}

	@Override
	public void readFields(DataInput arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write(DataOutput arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	public int compareTo(CompositeKey key) {
		// TODO Auto-generated method stub
		return this.serverId.compareTo(key.serverId) + this.partOfTheDay.compareTo(key.partOfTheDay);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
