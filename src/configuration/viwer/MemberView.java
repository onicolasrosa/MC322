package src.configuration.viwer;

import java.util.List;

import src.core.entities.members.Member;

public class MemberView implements ViewObject {
    public void printMember(Member member) {
        member.toString();
    }

    public void printGenericMember(Member member) throws IllegalArgumentException, IllegalAccessException {
        printLibraryObject(member);
    }

    public void printAllMembers(List<Member> members) {
        for (Member member : members) {
            printMember(member);
        }
        System.out.println("------------------------------");
    }
}
