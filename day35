class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int> ans;
        int ns = s.size(), np = p.size();
        if (ns < np) return ans;

        vector<int> cnt_s(26, 0);
        vector<int> cnt_p(26, 0);

        // 初始化：先统计p，还有s第一个窗口 [0,np-1]
        for(int i = 0; i < np; i++)
        {
            cnt_p[p[i] - 'a']++;
            cnt_s[s[i] - 'a']++;
        }
        if(cnt_s == cnt_p) ans.push_back(0);

        // 滑动窗口：窗口右端i，移除左边出去的字符，加入新进来的字符
        for(int i = np; i < ns; i++)
        {
            // 去掉窗口最左边：s[i-np] 滑出窗口
            cnt_s[s[i - np] - 'a']--;
            // 新增右边字符：s[i] 进入窗口
            cnt_s[s[i] - 'a']++;

            if(cnt_s == cnt_p)
            {
                ans.push_back(i - np + 1);
            }
        }
        return ans;
    }
};
