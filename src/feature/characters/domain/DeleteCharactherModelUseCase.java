package feature.characters.domain;

public class DeleteCharactherModelUseCase {

    private CharactherModelRepository charactherModelRepository;

    public DeleteCharactherModelUseCase(CharactherModelRepository charactherModelRepository) {
        this.charactherModelRepository = charactherModelRepository;
    }

    public void execute (String idCharacterModel){
        charactherModelRepository.deleteCharacterModel(idCharacterModel);
    }
}
