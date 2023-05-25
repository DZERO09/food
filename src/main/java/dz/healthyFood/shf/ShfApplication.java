package dz.healthyFood.shf;

import dz.healthyFood.shf.repo.BreadRepository;
import dz.healthyFood.shf.repo.RowMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ShfApplication {
	@Autowired
	BreadRepository repository;
	@Autowired
	RowMaterialRepository rowMaterialRepository ;

	public static void main(String[] args) {
		SpringApplication.run(ShfApplication.class, args);
	}

 /*@Bean
	ApplicationRunner applicationRunner (BreadRepository repository , RowMaterialRepository rowMaterialRepository){

	 RowMaterial rowMaterial =rowMaterialRepository.save(new RowMaterial("farina" , "health"));
	 Bread bread =repository.save(new Bread("matlou3","bla", Arrays.asList(rowMaterial)));
	 return args -> {
		 Pageable pageable =  PageRequest.of(0,  55);
		 repository.findAllByName("matlou3" ,pageable).forEach(bread1 ->
						 System.out.println(bread1.getName())
				 );


	 };
 }*/

}
