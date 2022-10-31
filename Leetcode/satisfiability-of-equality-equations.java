// 990-satisfiability-of-equality-equations

class Solution {

    public boolean equationsPossible(String[] equations) {
        if (equations.length == 0) return true;
        Map < Character, HashSet < Character >> map = new HashMap < > ();
        for (String formula: equations) {
            if (formula.charAt(1) == '=') {
                Character pre = formula.charAt(0);
                Character nxt = formula.charAt(3);
                if (!map.containsKey(pre)) map.put(pre, new HashSet < > ());
                map.get(pre).add(nxt);
                if (!map.containsKey(nxt)) map.put(nxt, new HashSet < > ());
                map.get(nxt).add(pre);
            }
        }

        for (String formula: equations) {
            if (formula.charAt(1) == '!') {
                Character pre = formula.charAt(0);
                Character nxt = formula.charAt(3);
                if (pre == nxt) return false;
                if (!map.containsKey(pre) || !map.containsKey(nxt)) continue;
                if (hasConflict(pre, nxt, map, new HashSet < > ())) return false;
            }
        }
        return true;
    }

    private boolean hasConflict(Character pre, Character nxt, Map < Character,
        HashSet < Character >> map, HashSet < Character > set) {
        if (pre == nxt) return true;
        set.add(pre);
        for (Character next: map.get(pre)) {
            if (set.contains(next)) continue;
            if (hasConflict(next, nxt, map, set)) return true;
        }
        return false;
    }
}
