/**
 * 
 */
package workshop.panel;

import junit.framework.TestCase;
import workshop.panel.hml.ProjectSampleType;

import org.junit.Test;

/**
 * @author kazu
 *
 */
public class ProjectSampleTypeTest extends TestCase {
	public static final String HML_REF_FILE = "src/test/resources/reference.xml";

	@Test
	public void test() {
		ProjectSampleType project = new ProjectSampleType(HML_REF_FILE);
		for (String sample : project.getSampleList()) {
			System.out.println(sample);
			String glstring = "";
			for (String gene : project.getHlaGeneList()) {
				if (project.getSampleGeneType().get(sample).containsKey(gene)) {
					System.out.println(gene);
					for (String type : project.getSampleGeneType().get(sample).get(gene)) {
						System.out.println(type);
						glstring += type + "^";	
					}
				}	
			}
			glstring = glstring.substring(0, glstring.length() - 1);
			System.out.println(glstring);
		}
	}

}
