package io.github.cpearl0.ctnhcore.data.recipe;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import fr.lucreeper74.createmetallurgy.data.recipes.CMRecipeProvider;
import fr.lucreeper74.createmetallurgy.registries.CMRecipeTypes;
import io.github.cpearl0.ctnhcore.registry.*;
import net.minecraft.data.recipes.FinishedRecipe;
import tech.vixhentx.mcmod.ctnhlib.registrate.builders.CTNHMaterial;
import tech.vixhentx.mcmod.ctnhlib.registrate.builders.CTNHRecipeType;
import vazkii.botania.common.item.BotaniaItems;

import java.util.function.Consumer;

import static io.github.cpearl0.ctnhcore.registry.CTNHRecipeTypes.*;
public class PhaseInversionRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        PHASE_INVERSION.recipeBuilder("mana_soc_inverse")
                .inputItems(CTNHManaItems.MANA_SOC)
                .inputFluids(CTNHMaterials.Zenith_essence, 400)
                .outputItems(CTNHManaItems.MANA_WAFER)
                .EUt(480)
                .duration(2000)
                .save(provider);

        PHASE_INVERSION.recipeBuilder("zenith_soc_inverse")
                .inputItems(CTNHManaItems.ZENITH_SOC)
                .inputItems(GTItems.SYSTEM_ON_CHIP_WAFER)
                .inputFluids(CTNHMaterials.Zenith_essence, 400)
                .outputItems(CTNHManaItems.ZENITH_WAFER)
                .EUt(480)
                .duration(4000)
                .save(provider);
    }
}
