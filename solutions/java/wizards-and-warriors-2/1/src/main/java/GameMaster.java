public class GameMaster {

    public String describe(Character character) {
        StringBuilder sb = new StringBuilder();
        return sb.append("You're a level ")
                .append(character.getLevel())
                .append(" ")
                .append(character.getCharacterClass())
                .append(" with ")
                .append(character.getHitPoints())
                .append(" hit points.").toString();
    }

    public String describe(Destination destination) {
        StringBuilder sb = new StringBuilder();
        return sb.append("You've arrived at ")
                .append(destination.getName())
                .append(", which has ")
                .append(destination.getInhabitants())
                .append(" inhabitants.").toString();
    }

    public String describe(TravelMethod travelMethod) {
        StringBuilder sb = new StringBuilder();
        return sb.append("You're traveling to your destination ")
                .append(travelMethod.equals(TravelMethod.WALKING) ? "by walking." : "on horseback.").toString();
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

        public String describe(Character character, Destination destination) {
        return describe(character) + " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }

}
