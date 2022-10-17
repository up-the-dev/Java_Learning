package concept.examples.enums;

public class EnumAdvanced2 {

	// Enum with a variable,method and constructor
	enum SeasonCustomized {
		WINTER(1) {
			@Override
			public int getExpectedMaxTemperature() {
				return 5;
			}
		},
		SPRING(2), SUMMER(3) {
			@Override
			public int getExpectedMaxTemperature() {
				return 20;
			}
		},
		FALL(4);

		// variable
		private int code;

		// method
		public int getCode() {
			return code;
		}

		// Constructor-only private or (default)
		// modifiers are allowed
		SeasonCustomized(int code) {
			this.code = code;
		}

		public int getExpectedMaxTemperature() {
			return 10;
		}

	}

	public static void main(String[] args) {
		SeasonCustomized season = SeasonCustomized.WINTER;

		System.out.println(season.getExpectedMaxTemperature());// 5

		System.out.println(SeasonCustomized.FALL.getExpectedMaxTemperature());// 10

	}

}