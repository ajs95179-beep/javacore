package demojava.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import demojava.buildingsearchinput.BuildingSearchInput;
import demojava.connectionutils.ConnectionUtil;
import demojava.daoanhyeuem.DaoAnhyeuem;

public class BuildingDaoImpl implements BuildingDao {
	
	@Override
	public List<DaoAnhyeuem> findbuiding(BuildingSearchInput buildingSearch) {
		List<DaoAnhyeuem> result =new ArrayList<>();
		Connection conn =null;
		Statement  stmt =null;
		ResultSet rs=null;
		try {
			conn=ConnectionUtil.getConnection();
			stmt=conn.createStatement();
	StringBuilder query = new StringBuilder("select *from building where 1=1")		;
	if ()
			
			
			
			
			
			rs=stmt.executeQuery(query)
			
			
		}
		
		
		return null;
	}
	

	

}
