//Source file: D:\\Rose\\biblio\\metier\\Employe.java

package metier;


public class Employe extends Utilisateur 
{
   private String codeMatricule;
   private EnumCategorieEmploye categorieEmploye;
   
   /**
    * @roseuid 5241490A002F
    */
   
		   //constructeurs
		   public Employe() {}
		
		   public Employe(String codeMatricule, EnumCategorieEmploye categorieEmploye) {
			super();
			this.codeMatricule = codeMatricule;
			this.categorieEmploye = categorieEmploye;
		   }
		   //getters and setters

		public String getCodeMatricule() {
			return codeMatricule;
		}

		

		public EnumCategorieEmploye getCategorieEmploye() {
			return categorieEmploye;
		}

		
   
    
   
}
