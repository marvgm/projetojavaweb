package teste.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Calendar;

import org.junit.Test;

import br.com.project.report.util.DateUtils;

public class TesteData {
	
	@Test
	public void testeData(){
		try {
			//System.out.println(DateUtils.getDateAtualReportName());

			assertEquals("08012019", DateUtils.getDateAtualReportName());
			
			assertEquals("'2019-01-08'", DateUtils.formatDateSql(Calendar.getInstance().getTime()) );
			
			assertEquals("2019-01-08", DateUtils.formatDateSqlSimple(Calendar.getInstance().getTime()) );
		}catch(Exception e){
			e.printStackTrace();
			fail(e.getMessage());

		}

	}

}
