package com.ilong.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ilong.bean.emp;
import com.ilong.utils.JDBCUtils;


public class demo {
	

	public static Connection conn = JDBCUtils.getConnection();
	public static void InsertDept(int id,String dname,String ioc) {
		String sql="insert into dept values(?,?,?)"	;	
		
		try {
			PreparedStatement pr = conn.prepareStatement(sql);
			pr.setInt(1, id);
			pr.setString(2, dname);
			pr.setString(3, ioc);
			int res=pr.executeUpdate();
			if(res>0){
				System.out.println("id："+id+"部门名："+dname+"位置:"+ioc+"，插入成功！");
			}
		/*	pr.close();
			conn.close();*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
		}

	}
	
	public static void DeleteById(int id) {
		String sql="delete  from  dept where id=?"	;	
		
		try {
			PreparedStatement pr = conn.prepareStatement(sql);
			pr.setInt(1, id);			
			int res = pr.executeUpdate();
			if(res>0){
				System.out.println("id为："+id+"删除成功！");
			}
			pr.close();
			/*pr.close();
			conn.close();*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}
	
	public static void UpdteByDeptName(String  DeptName,String NewDetpName) {
		String sql="update dept set dname=? where dname=?";	
			
		try {
			PreparedStatement pr = conn.prepareStatement(sql);
			pr.setString(1, NewDetpName);
			pr.setString(2, DeptName);	
			int res = pr.executeUpdate();
			if(res>0){
				System.out.println("部门名为："+DeptName+"修改部门名成功"
						+ "新部门名为："+NewDetpName);
			}
			pr.close();
			/*pr.close();
			conn.close();*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}
	public static List<emp> findAll(){
		String sql="select * from emp";
		ArrayList<emp> list = new ArrayList<>();
		try {
			PreparedStatement pr = conn.prepareStatement(sql);
			ResultSet rs = pr.executeQuery();
			emp emp = new emp();
			 while(rs.next()) {
	            	emp.setId(rs.getInt(1));
	            	emp.setEname(rs.getString(2));
	            	emp.setJobid(rs.getInt(3));
	            	emp.setMgr(rs.getInt(4));
	            	emp.setJoindate(rs.getDate(5));
	            	emp.setSalary(rs.getDouble(6));
	            	emp.setBonus(rs.getDouble(7));
	            	emp.setDeptid(rs.getInt(8));
	            	list.add(emp);
	            	
	            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
		
	} 
	
	public static void main(String args[]) throws SQLException  {
		long startTime = System.currentTimeMillis();    //获取开始时间
		List<emp> selectAllEmp = findAll();
		System.out.println(selectAllEmp.size());
		long endTime = System.currentTimeMillis();    //获取结束时间

		System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
		
		
		conn.close();
	}
		/*String user="root";
		String password="admin";  
		String url="jdbc:mysql://localhost:3306/yueqian";
		String sql="select * from emp";
		String updatesql="update emp set salary=? where id=?";
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn= DriverManager.getConnection(url, user, password);
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			PreparedStatement pr = conn.prepareStatement(updatesql);
			pr.setDouble(1, 1086);
			pr.setInt(2, 1001);
			int res=pr.executeUpdate();
			if(res>0){
				System.out.println("更新数据成功");
			}
			
            while(rs.next()) {
            	System.out.println("姓名："+rs.getString(1)+"工资:"+rs.getString(6));
            }
            pr.close();
            rs.close();
            conn.close();
			
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}finally {
			
			System.out.println("数据库数据成功获取！！");
		}
		
	}*/
}
