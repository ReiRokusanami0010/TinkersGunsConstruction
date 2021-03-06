package reirokusanami.materials.stats;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.text.TextFormatting;
import reirokusanami.materials.TGCMaterialTypes;
import slimeknights.tconstruct.library.Util;
import slimeknights.tconstruct.library.client.CustomFontColor;
import slimeknights.tconstruct.library.materials.AbstractMaterialStats;

import java.util.List;

public class MediumBarrelMaterialStats extends AbstractMaterialStats {
    public static final String LOC_AIR_TIGHTNESS = "stat.mediumbarrel.airtightness.name";
    public static final String LOC_ACCURACY      = "stat.mediumbarrel.accuracy.name";
    public static final String LOC_DURABILITY    = "stat.mediumbarrel.durability.name";
    public static final String LOC_MODIFIER      = "stat.mediumbarrel.modifier.name";
    public static final String COLOR_AIR_TIGHTNESS = CustomFontColor.encodeColor(51, 209, 130);
    public static final String COLOR_ACCURACY = CustomFontColor.encodeColor(123, 199, 221);
    public static final String COLOR_DURABILITY = CustomFontColor.valueToColorCode(1f);
    public static final String COLOR_MODIFIER = CustomFontColor.encodeColor(218, 182, 114);

    public final float AIR_TIGHTNESS;
    public final float ACCURACY;
    public final int   DURABILITY;
    public final float MODIFIER;

    public MediumBarrelMaterialStats(float airtightness, float accuracy, int durability, float modifier) {
        super(TGCMaterialTypes.MEDIUMBARREL);
        this.AIR_TIGHTNESS = airtightness;
        this.ACCURACY   = accuracy;
        this.DURABILITY = durability;
        this.MODIFIER   = modifier;
    }

    public static String formatAirTightness(float airtightness){
        return formatNumber(LOC_AIR_TIGHTNESS, COLOR_AIR_TIGHTNESS, airtightness);
    }

    public static String formatAccuracy(float accuracy) {
        return formatNumberPercent(LOC_ACCURACY, COLOR_ACCURACY, accuracy);
    }

    public static String formatDurability(int durability) {
        return formatNumber(LOC_DURABILITY, COLOR_DURABILITY, durability);
    }

    public static String formatModifier(float modifier) {
        return formatNumber(LOC_MODIFIER, COLOR_MODIFIER, modifier);
    }

    @Override
    public List<String> getLocalizedInfo() {
        return ImmutableList.of(
                formatAirTightness(AIR_TIGHTNESS),
                formatAccuracy(ACCURACY),
                formatModifier(MODIFIER)
        );
    }

    @Override
    public List<String> getLocalizedDesc() {
        return ImmutableList.of(
                Util.translate(LOC_AIR_TIGHTNESS),
                Util.translate(LOC_ACCURACY),
                Util.translate(LOC_DURABILITY),
                Util.translate(LOC_MODIFIER)
        );
    }
}
