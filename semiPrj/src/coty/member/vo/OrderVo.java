package coty.member.vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OrderVo {
	private String no;
	private String name;
	private String amount;
	private String total;
	private String ordate;
	private String state;
	private String re_yn;
	private String c_no;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getOrdate() {
		return ordate;
	}
	public void setOrdate(String ordate) {
		this.ordate = ordate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRe_yn() {
		return re_yn;
	}
	public void setRe_yn(String re_yn) {
		this.re_yn = re_yn;
	}
	public String getC_no() {
		return c_no;
	}
	public void setC_no(String c_no) {
		this.c_no = c_no;
	}
	public OrderVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderVo(String no, String name, String amount, String total, String ordate, String state, String re_yn,
			String c_no) {
		super();
		this.no = no;
		this.name = name;
		this.amount = amount;
		this.total = total;
		this.ordate = ordate;
		this.state = state;
		this.re_yn = re_yn;
		this.c_no = c_no;
	}
	@Override
	public String toString() {
		return "OrderListVo [no=" + no + ", name=" + name + ", amount=" + amount + ", total=" + total + ", ordate="
				+ ordate + ", state=" + state + ", re_yn=" + re_yn + ", c_no=" + c_no + "]";
	}

			
			
		}
	

	

