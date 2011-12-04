package spaska.data;

import spaska.data.Attribute.ValueType;


public abstract class Value implements Cloneable, Comparable<Value> {

	public abstract Object getValue();

	public abstract ValueType getType();

	@Override
	public String toString() {
		return getValue() + "";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Value)) {
			return false;
		}
		Value other = (Value)o;
		return getType() == other.getType() && getValue().equals(other.getValue());
	}
	
	@Override
	public int hashCode() {
		return getValue().hashCode();
	}
	
	public abstract Object clone();
	
	public abstract int compareTo(Value v);

}