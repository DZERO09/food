package dz.healthyFood.shf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

@SpringBootApplication
public class ShfApplication implements CommandLineRunner {


	record Bread(int id , String name){}
@Service
class BreadService {
		private JdbcTemplate template ;
		private final RowMapper<Bread> breadRowMapper = new RowMapper<Bread>() {
			@Override
			public Bread mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Bread(rs.getInt("id") , rs.getString("name"));
			}
		};
	public BreadService(JdbcTemplate template) {
		this.template = template;
	}

	Collection<Bread> all(){
			return this.template.query("select * from bread", this.breadRowMapper);
		}
}

	public static void main(String[] args) {
		SpringApplication.run(ShfApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
     Bread bread =new Bread(1 , "bagette");

	}


}
