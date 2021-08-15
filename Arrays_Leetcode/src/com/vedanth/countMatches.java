package com.vedanth;

import java.util.*;
class countMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int checkRuleIndex = 0;

        if ((ruleKey).equals("color")) {
            checkRuleIndex = 1;
        } else if ((ruleKey).equals("name")) {
            checkRuleIndex = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(checkRuleIndex).equals(ruleValue))
                ans++;
        }
        return ans;
    }
}