package pixalere.scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import pixalere.pageObjectUtils.PixalereCommonUtils;

public class PixalereShowPreventionScripts extends PixalereCommonUtils {
	public static List<String> Occuiput = new ArrayList<>();
	public static List<String> Scapula = new ArrayList<>();
	public static List<String> Spinous_process = new ArrayList<>();
	public static List<String> Elbow = new ArrayList<>();
	public static List<String> Lliac_crest = new ArrayList<>();
	public static List<String> Sacrum = new ArrayList<>();
	public static List<String> Ischial_Tuberosity = new ArrayList<>();
	public static List<String> Erythema = new ArrayList<>();
	public static List<String> Heel = new ArrayList<>();
	public static List<String> Sole = new ArrayList<>();
	public static List<String> Ear = new ArrayList<>();
	public static List<String> Shoulder = new ArrayList<>();
	public static List<String> Anterior_iliac_spine = new ArrayList<>();
	public static List<String> Trochanter = new ArrayList<>();
	public static List<String> Thigh = new ArrayList<>();
	public static List<String> Medial_knee = new ArrayList<>();
	public static List<String> Lateral_knee = new ArrayList<>();
	public static List<String> Lower_leg = new ArrayList<>();
	public static List<String> Medial_malleolus = new ArrayList<>();
	public static List<String> Lateral_malleolus = new ArrayList<>();
	public static List<String> Lateral_edge_of_foot = new ArrayList<>();
	public static List<String> Posterior_knee = new ArrayList<>();

	public void radio_Occuiput(String a, String b, String c) {
		Occuiput.add(a);
		Occuiput.add(b);
		Occuiput.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(By.xpath("(//td[normalize-space(text())='Occiput']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(By.xpath("(//td[normalize-space(text())='Occiput']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Occiput']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Occiput']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Occiput']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Occiput']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Occiput']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Occiput']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Occiput']//following::td)[3]//following::label)[2]"));
			}
		}
	}

	public void radio_Scapula(String a, String b, String c) {
		Scapula.add(a);
		Scapula.add(b);
		Scapula.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(By.xpath("(//td[normalize-space(text())='Scapula']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(By.xpath("(//td[normalize-space(text())='Scapula']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Scapula']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Scapula']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Scapula']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Scapula']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Scapula']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Scapula']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(
						By.xpath("((//td[normalize-space(text())='Scapula']//following::td)[3]//following::label)[2]"));
			}
		}
	}

	public void radio_Spinous_process(String a, String b, String c) {
		Spinous_process.add(a);
		Spinous_process.add(b);
		Spinous_process.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Spinous process']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Spinous process']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Spinous process']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Spinous process']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Spinous process']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Spinous process']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Spinous process']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Spinous process']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Spinous process']//following::td)[3]//following::label)[2]"));
			}
		}
	}

	public void radio_Elbow_process(String a, String b, String c) {
		Elbow.add(a);
		Elbow.add(b);
		Elbow.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Elbow']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Elbow']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Elbow']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Elbow']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Elbow']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Elbow']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Elbow']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Elbow']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Elbow']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Lliac_crest(String a, String b, String c) {
		Lliac_crest.add(a);
		Lliac_crest.add(b);
		Lliac_crest.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Lliac crest']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Lliac crest']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lliac crest']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lliac crest']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lliac crest']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lliac crest']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lliac crest']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lliac crest']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lliac crest']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Sacrum(String a, String b, String c) {
		Sacrum.add(a);
		Sacrum.add(b);
		Sacrum.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Sacrum']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Sacrum']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sacrum']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sacrum']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sacrum']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sacrum']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sacrum']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sacrum']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sacrum']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_IschialTuberosity(String a, String b, String c) {
		Ischial_Tuberosity.add(a);
		Ischial_Tuberosity.add(b);
		Ischial_Tuberosity.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Ischial Tuberosity']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Ischial Tuberosity']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ischial Tuberosity']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ischial Tuberosity']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ischial Tuberosity']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ischial Tuberosity']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ischial Tuberosity']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ischial Tuberosity']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ischial Tuberosity']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Erythema(String a, String b, String c) {
		Erythema.add(a);
		Erythema.add(b);
		Erythema.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Erythema']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Erythema']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Erythema']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Erythema']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Erythema']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Erythema']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Erythema']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Erythema']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Erythema']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Heel(String a, String b, String c) {
		Heel.add(a);
		Heel.add(b);
		Heel.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Heel']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Heel']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Heel")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Heel']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Heel']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Heel']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Heel']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Heel']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Heel']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Heel']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Sole(String a, String b, String c) {
		Sole.add(a);
		Sole.add(b);
		Sole.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Sole']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Sole']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sole']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sole']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sole']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sole']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sole']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sole']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Sole']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Ear(String a, String b, String c) {
		Ear.add(a);
		Ear.add(b);
		Ear.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Ear']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Ear']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ear']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ear']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ear']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ear']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ear']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ear']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Ear']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Shoulder(String a, String b, String c) {
		Shoulder.add(a);
		Shoulder.add(b);
		Shoulder.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Shoulder']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Shoulder']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Shoulder']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Shoulder']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Shoulder']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Shoulder']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Shoulder']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Shoulder']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Shoulder']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Anterior_iliac_spine(String a, String b, String c) {
		Anterior_iliac_spine.add(a);
		Anterior_iliac_spine.add(b);
		Anterior_iliac_spine.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Anterior iliac spine']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Anterior iliac spine']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Anterior iliac spine']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Anterior iliac spine']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Anterior iliac spine']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Anterior iliac spine']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Anterior iliac spine']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Anterior iliac spine']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Anterior iliac spine']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Trochanter(String a, String b, String c) {
		Trochanter.add(a);
		Trochanter.add(b);
		Trochanter.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Trochanter']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Trochanter']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Trochanter']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Trochanter']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Trochanter']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Trochanter']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Trochanter']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Trochanter']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Trochanter']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Thigh(String a, String b, String c) {
		Thigh.add(a);
		Thigh.add(b);
		Thigh.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Thigh']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Thigh']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Thigh']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Thigh']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Thigh']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Thigh']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Thigh']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Thigh']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Thigh']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Medial_knee(String a, String b, String c) {
		Medial_knee.add(a);
		Medial_knee.add(b);
		Medial_knee.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Medial knee']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Medial knee']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial knee']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial knee']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial knee']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial knee']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial knee']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial knee']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial knee']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Lateral_knee(String a, String b, String c) {
		Lateral_knee.add(a);
		Lateral_knee.add(b);
		Lateral_knee.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Lateral knee']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Lateral knee']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral knee']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral knee']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral knee']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral knee']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral knee']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral knee']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral knee']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Lower_leg(String a, String b, String c) {
		Lower_leg.add(a);
		Lower_leg.add(b);
		Lower_leg.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Lower leg']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Lower leg']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lower leg']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lower leg']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lower leg']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lower leg']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lower leg']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lower leg']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lower leg']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Medial_malleolus(String a, String b, String c) {
		Medial_malleolus.add(a);
		Medial_malleolus.add(b);
		Medial_malleolus.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Medial malleolus']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Medial malleolus']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial malleolus']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial malleolus']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial malleolus']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial malleolus']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial malleolus']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial malleolus']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Medial malleolus']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Lateral_malleolus(String a, String b, String c) {
		Lateral_malleolus.add(a);
		Lateral_malleolus.add(b);
		Lateral_malleolus.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Lateral malleolus']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Lateral malleolus']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral malleolus']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral malleolus']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral malleolus']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral malleolus']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral malleolus']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral malleolus']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral malleolus']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Lateral_edge_of_foot(String a, String b, String c) {
		Lateral_edge_of_foot.add(a);
		Lateral_edge_of_foot.add(b);
		Lateral_edge_of_foot.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Lateral edge of foot']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Lateral edge of foot']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral edge of foot']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral edge of foot']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral edge of foot']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral edge of foot']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral edge of foot']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral edge of foot']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Lateral edge of foot']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_Posterior_knee(String a, String b, String c) {
		Posterior_knee.add(a);
		Posterior_knee.add(b);
		Posterior_knee.add(c);
		if (a.equalsIgnoreCase("Yes")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Posterior knee']//following-sibling::*//div//label)[1]"));
		}

		if (a.equalsIgnoreCase("No")) {
			clickElement(
					By.xpath("(//td[normalize-space(text())='Posterior knee']//following-sibling::*//div//label)[2]"));

			if (b.equalsIgnoreCase("Erythema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Posterior knee']//following::td)[2]//following::label)[1]"));
			}

			if (b.equalsIgnoreCase("Blisters")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Posterior knee']//following::td)[2]//following::label)[2]"));
			}

			if (b.equalsIgnoreCase("Localized Edema")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Posterior knee']//following::td)[2]//following::label)[3]"));
			}

			if (b.equalsIgnoreCase("Localized Induration")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Posterior knee']//following::td)[2]//following::label)[4]"));
			}

			if (b.equalsIgnoreCase("Non Blanchable Redness")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Posterior knee']//following::td)[2]//following::label)[5]"));
			}

			if (c.equalsIgnoreCase("Yes")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Posterior knee']//following::td)[3]//following::label)[1]"));
			}

			if (c.equalsIgnoreCase("No")) {
				clickElement(By.xpath(
						"((//td[normalize-space(text())='Posterior knee']//following::td)[3]//following::label)[2]"));
			}
		}
	}
	
	public void radio_risk_level(String string) {
		if(string.equalsIgnoreCase("Severe Risk")) {
			clickElement(By.xpath("(//label[contains(@for,'risk_level')])[1]"));
		}
		
		if(string.equalsIgnoreCase("Very High")) {
			clickElement(By.xpath("(//label[contains(@for,'risk_level')])[2]"));
		}
		
		if(string.equalsIgnoreCase("High")) {
			clickElement(By.xpath("(//label[contains(@for,'risk_level')])[3]"));
		}
		
		if(string.equalsIgnoreCase("Medium")) {
			clickElement(By.xpath("(//label[contains(@for,'risk_level')])[4]"));
		}
		
		if(string.equalsIgnoreCase("Low")) {
			clickElement(By.xpath("(//label[contains(@for,'risk_level')])[5]"));
		}
		
	}
}
