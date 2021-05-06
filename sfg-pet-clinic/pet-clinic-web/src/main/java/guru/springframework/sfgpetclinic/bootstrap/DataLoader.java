package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.map.VetServiceMap;
import guru.springframework.sfgpetclinic.models.Owner;
import guru.springframework.sfgpetclinic.models.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	
	private final OwnerService ownerService;
	private final VetService vetService;
	
//	public DataLoader() {
//	
//		ownerService = new OwnerServiceMap();
//		vetService =new VetServiceMap();
//	}
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}
		
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Owner owner1=new Owner();
		owner1.setFirstName("Swathi");
		owner1.setLastName("Bhat");
		
		ownerService.save(owner1);
		
		Owner owner2=new Owner();
		owner2.setFirstName("Srivatsa");
		owner2.setLastName("Santyar");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners!!");
		
		Vet vet1=new Vet();
		vet1.setFirstName("Prathap");
		vet1.setLastName("Bhat");
		
		vetService.save(vet1);
		
		Vet vet2=new Vet();
		vet2.setFirstName("Shalini");
		vet2.setLastName("Bhat");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets!!");
		
	
	}


	
	
}
