package org.enset;

import org.enset.dao.EtudiantRepository;
import org.enset.entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class EnsetSecApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx= SpringApplication.run(EnsetSecApplication.class, args);
		EtudiantRepository etudiantRepository=
				ctx.getBean(EtudiantRepository.class);
		DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
		etudiantRepository.save(new Etudiant("Brumel","Atemgoua",df.parse("1995-3-17")));
		etudiantRepository.save(new Etudiant("Daniella","Manfouo",df.parse("1995-3-17")));
		etudiantRepository.save(new Etudiant("Sara","Tchemdem",df.parse("1995-3-17")));
		etudiantRepository.save(new Etudiant("Carelle","Sontia",df.parse("1995-3-17")));
		etudiantRepository.save(new Etudiant("Aniss","Adji",df.parse("1995-3-17")));
		etudiantRepository.save(new Etudiant("Brumel","Atemgoua",df.parse("1995-3-17")));
		etudiantRepository.save(new Etudiant("Brumel","Atemgoua",df.parse("1995-3-17")));
		etudiantRepository.save(new Etudiant("Brumel","Atemgoua",df.parse("1995-3-17")));
		etudiantRepository.save(new Etudiant("Brumel","Atemgoua",df.parse("1995-3-17")));

		List<Etudiant> etds= etudiantRepository.findAll();
		etds.forEach(e->System.out.println(e.getNom()));
		for(Etudiant e:etds){
			System.out.println(e.getNom() );
		}

	}

}
