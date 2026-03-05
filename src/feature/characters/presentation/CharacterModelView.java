package feature.characters.presentation;

import feature.characters.data.CharacterMemLocalDataSource;
import feature.characters.data.CharacterModelDataRepository;
import feature.characters.domain.CharacterModel;
import feature.characters.domain.DeleteCharactherModelUseCase;
import feature.characters.domain.GetCharactherModelUseCase;
import feature.characters.domain.SaveCharactherModelUseCase;

import java.util.ArrayList;

public class CharacterModelView {

    public static void printCharacterModel (){

        GetCharactherModelUseCase getCharactherModelUseCase = new GetCharactherModelUseCase(new CharacterModelDataRepository(CharacterMemLocalDataSource.newInstance()));

        ArrayList <CharacterModel> characterModels;
        characterModels = getCharactherModelUseCase.execute();
        System.out.println(characterModels);

    }

    public static void saveCharacterModel (){

        SaveCharactherModelUseCase saveCharactherModelUseCase = new SaveCharactherModelUseCase(new CharacterModelDataRepository(CharacterMemLocalDataSource.newInstance()));

        printCharacterModel();
        saveCharactherModelUseCase.execute(new CharacterModel("123", "tomas", "man", "black", "33" ));
        printCharacterModel();

    }

    public static void deleteCharacterModel (){

        DeleteCharactherModelUseCase deleteCharactherModelUseCase = new DeleteCharactherModelUseCase(new CharacterModelDataRepository(CharacterMemLocalDataSource.newInstance()));

        printCharacterModel();
        deleteCharactherModelUseCase.execute("123");
        printCharacterModel();

    }
}
