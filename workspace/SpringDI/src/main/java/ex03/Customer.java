package ex03;

import java.util.List;
import java.util.Map;

public class Customer {
	private List<String> list;
	private List<MemberVO> vo;
	private Map<String, Object> map;
	
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public List<MemberVO> getVo() {
		return vo;
	} 
	public void setVo(List<MemberVO> vo) {
		this.vo = vo;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	
	

}
