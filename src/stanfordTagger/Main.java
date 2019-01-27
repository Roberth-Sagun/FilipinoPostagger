package stanfordTagger;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;


public class Main {
    public static void main(String args[]){
        MaxentTagger tagger = new MaxentTagger("filipino-left5words-owlqn2-distsim-pref6-inf2.tagger");

        String taggedString = tagger.tagString("Bumili ng baso si Nene.");
        System.out.println(taggedString);

    }

}
