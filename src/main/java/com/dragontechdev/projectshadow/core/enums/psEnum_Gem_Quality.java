package com.dragontechdev.projectshadow.core.enums;

public enum psEnum_Gem_Quality {
	CHIPPED,
	FLAWED,
	NORMAL,
	FLAWLESS(true),
	PERFECT(true);

	private final boolean isGlowing;

	psEnum_Gem_Quality(boolean isGlowing) {
			this.isGlowing = isGlowing;
		}

	psEnum_Gem_Quality() {
			this(false);
		}
}
