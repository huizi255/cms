package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.briup.cms.bean.Fruit;
import com.briup.cms.common.ConnectionFactory;
public class FruitDao {
	//添加水果
	public void save(Fruit fruit){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_fruit(name,price,place) values(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, fruit.getName());
				pstmt.setDouble(2, fruit.getPrice());
				pstmt.setString(3, fruit.getPlace());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//查询所有水果
	public List<Fruit> findAll(){
		List<Fruit> list = new ArrayList<Fruit>();
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_fruit";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Long id = rs.getLong("id");
					String name = rs.getString("name");
					Double price = rs.getDouble("price");
					String place = rs.getString("place");
					Fruit fruit = new Fruit();
					fruit.setId(id);
					fruit.setName(name);
					fruit.setPlace(place);
					fruit.setPrice(price);
					list.add(fruit);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
    //通过id删除水果
	public void delete(Long id){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "delete from t_fruit where id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
		        pstmt.executeUpdate();		
	   		}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//通过id查询水果
	public Fruit findById(Long id){
		Fruit fruit = null;
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_fruit where id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				rs = pstmt.executeQuery();
				while(rs.next()){
					String name = rs.getString("name");
					Double price = rs.getDouble("price");
					String place = rs.getString("place");
					fruit = new Fruit(name, price, place);
					fruit.setId(id);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fruit;
	}
	//修改水果
	public void update(Fruit fruit){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "update t_fruit set name=?,price=?,place=? where id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,fruit.getName());
				pstmt.setDouble(2, fruit.getPrice());
				pstmt.setString(3,fruit.getPlace());
				pstmt.setLong(4, fruit.getId());
				pstmt.executeUpdate();
			}finally{
                ConnectionFactory.close(null, pstmt, conn);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
