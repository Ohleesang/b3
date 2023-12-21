/**
 *  실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어수/스테이지에 도달한 플레이어수
 *  N : 스테이지의 개수
 *  stages : 사용자가 멈춰있는 스테이지의 번호
 *
 *  실패율이 높은 스테이지 부터 내림차순으로 정렬해서 리턴
 */

class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = IntArray(N,{0})
        var stageList = stages.toMutableList()
        stageList.sort()
        for(stage in 1..N){

        }
        return answer
    }
}
fun main(){
    var a = Solution()
    a.solution(5, intArrayOf(2,1,2,6,2,4,3,3))//3,4,2,1,5
    a.solution(4, intArrayOf(4,4,4,4,4))//4,1,2,3
}