package beans;

import java.io.Serializable;

public class CustomerVO  implements Serializable{
	private String yqdz_yqzh; //用气账号 
	private String yqdz_kh_lx; //客户类型
	private String yqdz_kh_id; // 客户ID
	public String getYqdz_yqzh() {
		return yqdz_yqzh;
	}
	public void setYqdz_yqzh(String yqdz_yqzh) {
		this.yqdz_yqzh = yqdz_yqzh;
	}
	public String getYqdz_kh_lx() {
		return yqdz_kh_lx;
	}
	public void setYqdz_kh_lx(String yqdz_kh_lx) {
		this.yqdz_kh_lx = yqdz_kh_lx;
	}
	public String getYqdz_kh_id() {
		return yqdz_kh_id;
	}
	public void setYqdz_kh_id(String yqdz_kh_id) {
		this.yqdz_kh_id = yqdz_kh_id;
	}
	
	
}
