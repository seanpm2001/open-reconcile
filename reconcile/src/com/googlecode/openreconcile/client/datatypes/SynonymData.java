package com.googlecode.openreconcile.client.datatypes;

import java.io.Serializable;

public class SynonymData implements Serializable{
	/**
	 * 	Autogenerated serialVersionUID
	 */
	private static final long serialVersionUID = -5178539204720871301L;
	
	public String sFrom;
	public String sTo;
	public String sType;

	/**
	 * 	constructor
	 */	
	SynonymData(){
		sFrom=sTo=sType=null;
	}
	/**
	 * 	Constructor
	 @param from the string that is the string that should be replace
	 @param to the string the "from" string should be converted to
	 @param thisType the type this rule should be applied to
	 */
	public SynonymData(String from, String to, String thisType){
		sFrom = from;
		sTo = to;
		sType = thisType;
	}
	/**
	 * 	Returns the value of "From" for a Synonym object
	 * 
	 @return string value for the string to be replaced
	 */
	public String getFrom(){
		return sFrom;
	}
	/**
	 * 	Returns the value of "to" for a Synonym object
	 * 
	 @return string value for the from string is to be replaced with
	 */
	public String getTo(){
		return sTo;
	}
	/**
	 * 	Returns the type this rule applies to
	 * 
	 @return string value for the type this rule is for
	 */
	public String getDBtype(){
		return sType;
	}
	/**
	 * 	Returns a list of column names. This is mostly a helper function for the server.
	 * 
	 @return string column name list
	 */	
	public String getColumnList(){
		return "fromterm, toterm, type";
	}
	/**
	 * 	Returns a list of column names. This is mostly a helper function for the server.
	 * 
	 @return string column name list
	 */	
	public String getColumnNameList(){
		return "'fromterm', 'toterm', 'type'";
	}
	/**
	 * 	Returns a list of values to be put into the database table. This is mostly a helper function for the server.
	 * 
	 @return string values name list
	 */	
	public String getValuesList(){
		return "'"+sFrom+"', '"+sTo+"', '"+sType+"'";
	}
}