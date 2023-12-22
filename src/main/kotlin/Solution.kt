/**
 *  실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어수/스테이지에 도달한 플레이어수
 *  N : 스테이지의 개수
 *  stages : 사용자가 멈춰있는 스테이지의 번호
 *
 *  실패율이 높은 스테이지 부터 내림차순으로 정렬해서 리턴
 */

class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = intArrayOf()
        var result = mutableMapOf<Int, Double>()//<stage,실패율>
        var stageList = stages.toMutableList()
        stageList.sort()

        for (stage in 1..N) {
            //초기화
            var count = 0
            var size = stageList.size
            //실폐율 계산
            stageList.forEach {
                if (stage >= it) count++
            }
            //stage,실폐율 입력
            result.put(stage, (count.toDouble() / size))
            //list 사이즈 줄이기
            for (i in 0..count - 1) {
                stageList.removeFirst()
            }

        }
        //정렬기능을 쓰기위해 list로 치환이후 다시 map으로 변환후, 키값만 출력
        var sortedMap = result.toList().sortedWith(compareBy { -it.second }).toMap()
        answer = sortedMap.keys.toIntArray()
        return answer
    }
}

fun main() {
    var a = Solution()
    a.solution(5, intArrayOf(2, 1, 2, 6, 2, 4, 3, 3))//3,4,2,1,5
    a.solution(4, intArrayOf(4, 4, 4, 4, 4))//4,1,2,3
}