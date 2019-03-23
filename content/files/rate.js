// @author Alan Harder
var crumb = { wrap: function() { } };

function loaddata() {
  var script = document.createElement('SCRIPT');
  script.type = 'text/javascript';
  script.src = 'https://rating.jenkins.io/rate/result.php';
  script.onload = function() { do_loaddata(); }
  script.onreadystatechange = function() { // For IE
    if (this.readyState=='loaded' || this.readyState=='complete') do_loaddata();
  }
  document.getElementById('head').appendChild(script);
  document.getElementById('ratings').style.display = 'block';
  return false;
}

function health(nm,cls,ver,rate,desc) {
  return '<img src="/images/changelog/' + nm + '.png" onclick="rate(\'' + ver + '\',' + rate + ')" class="rate ' + cls + '" alt="' + nm + '" title="' + desc + '"/>';
}

function do_loaddata() {
  var r, v, j = true, div1, div2, txt;
  for (var anchors = document.getElementsByTagName('H3'), i = 0; i < anchors.length; i++) {
    if (anchors[i].id.charAt(0) != 'v') continue;
    r = data[v = anchors[i].id.substring(1)];
    div1 = document.createElement('DIV');
    div1.className = 'rate-outer';
    div2 = document.createElement('DIV');
    div2.className = 'rate-offset';
    txt = (r && r[0] ? r[0] + ' ' : '0 ') + health('sunny',(r && r[0] ? '' : 'light'),v,1, 'No major issues with this release')
        + (r && r[1] ? r[1] + ' ' : '0 ') + health('cloudy',(r && r[1] ? '' : 'light'),v,0, 'I experienced notable issues')
        + (r && r[2] ? r[2] + ' ' : '0 ') + health('storm',(r && r[2] ? '' : 'light'),v,-1, 'I had to roll back');
    if (r && r.length > 3) {
      txt += '<span class="related-issues">社区报告的缺陷：';
      for (j = 3; j < r.length; j+=2)
        txt += r[j+1] + '&times;<a href="https://issues.jenkins-ci.org/browse/JENKINS-' + r[j] + '">JENKINS-' + r[j] + '</a> ';
      txt += '</span>';
    }
    div2.innerHTML = txt;
    div1.appendChild(div2);
    anchors[i].parentNode.insertBefore(div1, anchors[i].nextElementSibling);
  }
}

function rate(version,rating) {
  var issue = (rating <= 0) ? prompt('请提供记录在我们 JIRA 中的缺陷编号：','') : '';
  if (issue==null) return; // Cancelled
  if (rating <= 0 && issue == '') {
    issue = prompt('你确定不想要提供缺陷索引吗？它确实可以帮忙我们改进 Jenkins.\n输入缺陷编号，或留空白跳过：', '');
    if (issue==null) return; // Cancelled
  }
  var script = document.createElement('SCRIPT');
  script.type = 'text/javascript';
  script.src = 'https://rating.jenkins.io/rate/submit.php?version='
    + encodeURIComponent(version) + '&rating=' + rating + '&issue=' + encodeURIComponent(issue);
  script.onload = function() { alert('谢谢！'); location.reload(); }
  script.onreadystatechange = function() { // For IE
    if (this.readyState=='loaded' || this.readyState=='complete') {
      alert('谢谢！'); location.reload();
    }
  }
  document.getElementById('head').appendChild(script);
}

