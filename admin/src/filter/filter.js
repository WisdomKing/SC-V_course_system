/**
 * 配合新修改的filter.js使用
 * 数组过滤器 例如：{{manhourType_projectname | optionKV(manhourType.projectname)}}
 * @param object 例如：{CLOCKIN:{key:"D",value:"交付项目"},{key:"P",value:"售前项目"},{key:"R",value:"研发项目"},{key:"I",value:"内部项目"}}
 * @param key 例如：D
 * @returns {string} 例如：交付项目
 * 这就是一个普通的js函数，要想变成过滤器，需要在main.js里面加Object.keys(filter).forEach(key => {Vue.filter(key, filter[key])});
 */
let optionKV = (object, key) =>  {
    if (!object || !key) {
        return "";
    } else {
        let result = "";
        for(let enums in object){
            //会在控制台输出
            // console.log(object[enums]["key"]);
            if (key === object[enums]["key"]) {
                result = object[enums]["value"];
            }
        }
        return result;
    }
};
/**
 * 数组过滤器 例如：{{CHARGE | optionKVArray(section.charge)}}
 * @param list 例如：[{key:"C", value:"收费"},{key:"F", value:"免费"}]
 * @param key 例如：C
 * @returns {string} 例如：收费
 */
//先判断参数是否为空，养成习惯，尽量让自己的代码更严谨，因为你不知道使用含会传入什么幺蛾子
let optionKVArray = (list, key) =>  {
    if (!list || !key) {
        return "";
    } else {
        let result = "";
        for (let i = 0; i < list.length; i++) {
            if (key === list[i]["key"]) {
                result = list[i]["value"];
            }
        }
        return result;
    }
};

export default {
    optionKV,
}
